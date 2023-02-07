<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Commande</title>
</head>
<body>
	<form id="form-commande" method="POST" action="./resume">

		<div>
			<label for="genre">Nom : </label> <select id="genre" name="genre">
				<option value="MR">MR</option>
				<option value="M">M</option>
			</select> <input id="nom" name="nom" placeholder="Votre nom" type="text" />
		</div>
		<div>
			<label for="entree">Entrée : </label> <br> <select id="entree"
				name="entree">
				<option value=""></option>
				<c:forEach var="entree" items="${menu.getListEntree()}">
					<option value="${ entree.getNom() }">${ entree.getNom() }</option>
				</c:forEach>
			</select>
		<div>
		</div>
			<label for="plat">Plat : </label> <br> <select id="plat"
				name="plat">
				<option value=""></option>
				<c:forEach var="plat" items="${menu.getListPlat()}">
					<option value="${ plat.getNom() }">${ plat.getNom() }</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<label for="desert">Desert : </label> <br> <select id="desert"
				name="desert">
				<option value=""></option>
				<c:forEach var="desert" items="${menu.getListDesert()}">
					<option value="${ desert.getNom() }">${ desert.getNom() }</option>
				</c:forEach>
			</select>
		</div>
		<br>
		<div>
			<input type="submit" value="Enregistrer" id="button" />
		</div>
	</form>
</body>
</html>