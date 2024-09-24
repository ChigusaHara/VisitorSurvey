package work;

import java.io.Serializable;

public class visitorSurvey implements Serializable{
	private int age;
	private String gender;
	private String drink;
	private int dringRate;
	private String food;
	private int foodRate;
	private int shopRate;
	private int serveRate;
	private String opinion;
	private String[] menu;
	
	
	public visitorSurvey() {
	}
	
	public visitorSurvey(int age, String gender, String drink, int drinkRate, String food, int foodRate, 
			int shopRate, int serveRate, String opinion, String[] menu) {
		this.setAge(age);
		this.setGender(gender);
		this.setDrink(drink);
		this.setDringRate(drinkRate);
		this.setFood(food);
		this.setFoodRate(foodRate);
		this.setShopRate(shopRate);
		this.setServeRate(serveRate);
		this.setOpinion(opinion);
		this.setMenu(menu);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public int getDringRate() {
		return dringRate;
	}

	public void setDringRate(int dringRate) {
		this.dringRate = dringRate;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getFoodRate() {
		return foodRate;
	}

	public void setFoodRate(int foodRate) {
		this.foodRate = foodRate;
	}

	public int getShopRate() {
		return shopRate;
	}

	public void setShopRate(int shopRate) {
		this.shopRate = shopRate;
	}

	public int getServeRate() {
		return serveRate;
	}

	public void setServeRate(int serveRate) {
		this.serveRate = serveRate;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}
	

	
}
