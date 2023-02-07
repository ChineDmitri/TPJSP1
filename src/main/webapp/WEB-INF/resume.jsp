<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résume</title>
</head>
<body>
	<div>
		<p>${ resume.getGenre() } ${ resume.getNom() }a commandé</p>
		<p>
			<b>En entré : </b>${ !empty resume.getEntree() ? resume.getEntree() : "Rien"}</p>
		<p>
			<b>En plat : </b>${ !empty resume.getPlat() ? resume.getPlat() : "Rien"}</p>
		<p>
			<b>En desert : </b>${ !empty resume.getDesert() ? resume.getDesert() : "Rien"}</p>
	</div>
	<hr>
</body>
</html>