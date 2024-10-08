<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お客様アンケートもどき</title>
	</head>
	<body>
		<h1>アンケートへのご協力よろしくお願い致します。</h1>
		<form action="SurveyServlet" method="post">
		<table>
			<tr>
				<td>年齢</td>
				<td><input type="text" name="age" size="5">歳</td>
			</tr>
			<tr>
				<td>性別</td>
				<td>男性<input type="radio" name="gender" value="男性" selected>
					女性<input type="radio" name="gender" value="女性">
					選択しない<input type="radio" name="gender" value="未選択"></td>
			</tr>
			<tr>
				<td>来店日</td>
				<td>
					<input type="date" name="date" value="2024-01-01">
				</td>
			</tr>	
			<tr>
				<td>頼んだドリンク</td>
				<td>
					<select name="drink">
					<option hidden value="">選択してください</option>
					<option value="ホットコーヒー">ホットコーヒー</option>
					<option value="アイスコーヒー">アイスコーヒー</option>
					<option value="カフェラテ">カフェラテ</option>
					<option value="紅茶">紅茶</opinion>
					<option value="アイスティー">アイスティー</option>
					<option value="ロイヤルミルクティー">ロイヤルミルクティー</option>
					<option value="選択なし">頼んでいない</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>ドリンクの満足度</td>
				<td>
					<select name="drinkRate">
						<option value="5" selected>★★★★★</option>
						<option value="4">★★★★</option>
						<option value="3">★★★</option>
						<option value="2">★★</option>
						<option value="1">★</option>
						<option value="1">頼んでいない</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>頼んだフード</td>
				<td>
					<select name="food">
					<option hidden value="">選択してください</option>
					<option value="チョコケーキ">チョコケーキ</option>
					<option value="フルーツタルト">フルーツタルト</option>
					<option value="チーズケーキ">チーズケーキ</option>
					<option value="アイスクリーム">アイスクリーム</option>
					<option value="サンドイッチ">サンドイッチ</option>
					<option value="パフェ">パフェ</option>
					<option value="選択なし">頼んでいない</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>フードの満足度</td>
				<td>
					<select name="foodRate">
						<option value="5" selected>★★★★★</option>
						<option value="4">★★★★</option>
						<option value="3">★★★</option>
						<option value="2">★★</option>
						<option value="1">★</option>
						<option value="1">頼んでいない</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>お店の満足度</td>
				<td>
					<select name="shopRate">
						<option value="5" selected>★★★★★</option>
						<option value="4">★★★★</option>
						<option value="3">★★★</option>
						<option value="2">★★</option>
						<option value="1">★</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>接客の満足度</td>
				<td>
					<select name="serveRate">
						<option value="5" selected>★★★★★</option>
						<option value="4">★★★★</option>
						<option value="3">★★★</option>
						<option value="2">★★</option>
						<option value="1">★</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>感想・意見</td>
				<td><textarea name="opinion" cols="40" rows="5" maxlength="200" 
						placeholder="こちらにご記入ください" style="resize : none"></textarea></td>
			</tr>
			<tr>
				<td>追加してほしいメニュー（複数選択可）</td>
				<td>
					<input type="checkbox" name="menu" value="レモネード" checked>レモネード
					<input type="checkbox" name="menu" value="ハーブティー">ハーブティー
					<input type="checkbox" name="menu" value="抹茶ラテ">抹茶ラテ
					<input type="checkbox" name="menu" value="プリン">プリン
					<input type="checkbox" name="menu" value="アップルパイ">アップルパイ
					<input type="checkbox" name="menu" value="ティラミス">ティラミス
					<input type="checkbox" name="menu" value="フルーツサンド">フルーツサンド
				</td>
			</tr>
		</table>
		<input type="submit" value="送信">
		<input type="reset" value="取消">
		</form>
	</body>
</html>