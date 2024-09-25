package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import work.answerDBConnect;
import work.visitorSurvey;


@WebServlet("/surveyServlet")
public class surveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if (action == null) {
			//入力画面へリダイレクト
			response.sendRedirect("suurveyForm");
		}else if (action.equals("confirmed")) {
			//完了画面へフォワード
			RequestDispatcher rdDone = request.getRequestDispatcher("WEB-INF/jsp/doneSurvey.jsp");
			rdDone.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ageStr = request.getParameter("age");
		String gender = request.getParameter("gender");
		String drink = request.getParameter("drink");
		String drinkRateStr = request.getParameter("drinkRate");
		String food = request.getParameter("food");
		String foodRateStr = request.getParameter("foodRate");
		String shopRateStr = request.getParameter("shopRate");
		String serveRateStr = request.getParameter("serveRate");
		String opinion = request.getParameter("opinion");
		String[] menu = request.getParameterValues("menu");
		//int型変換
		int age = Integer.parseInt(ageStr);
		int drinkRate = Integer.parseInt(drinkRateStr);
		int foodRate = Integer.parseInt(foodRateStr);
		int shopRate = Integer.parseInt(shopRateStr);
		int serveRate = Integer.parseInt(serveRateStr);
		
		
		answerDBConnect db = new answerDBConnect();
		db.insert(age, gender, drink, drinkRate, food, foodRate, shopRate, serveRate, opinion);
		db.insertMenu(menu);
		
		//情報格納インスタンス
		visitorSurvey survey = new visitorSurvey(
				age, gender, drink, drinkRate, food, foodRate, shopRate, serveRate, opinion, menu);
		
		//セッションスコープに格納
		HttpSession session = request.getSession();
		session.setAttribute("survey", survey);
		
		//確認画面へフォワード
		RequestDispatcher rdConfirm = request.getRequestDispatcher("WEB-INF/jsp/confirmSurvey.jsp");
		rdConfirm.forward(request, response);
}


}
