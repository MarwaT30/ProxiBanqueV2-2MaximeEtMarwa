<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Votre Liste De Clients</title>
</head>
<body>
	<img src="logoProxiBanque.png">
	<h1>Cette Page vous affiche votre liste de Clients :)</h1>

	<table>
		<tr>
			<td>Id</td>
			<td>Nom</td>
			<td>Prénom</td>
			<td>Rue</td>
			<td>Code Postal</td>
			<td>Ville</td>
			<td>Telephone</td>
			<td>Adresse e-mail</td>
		</tr>

		<c:forEach items="${clients}" var="cl">

			<tr>
				<td>${cl.idClient}</td>
				<td>${cl.nom}</td>
				<td>${cl.prenom}</td>
				<td>${cl.rue}</td>
				<td>${cl.codePostal}</td>
				<td>${cl.ville}</td>
				<td>${cl.numeroTel}</td>
				<td>${cl.mail}</td>
			<tr>
		</c:forEach>
	</table>

	<p />
	<a href="EditionClient.html"> Modifier Informations </a> : Formulaire
	de Test
	<p />
	<!-- <a href="WEB-INF/ListeComptes.jsp"> Liste des Comptes </a> -->
	<a href="ListeComptes.jsp"> Liste des Comptes </a> : Page en cours de
	développement, revenez plus tard !!

	<p />
	<a href="creation.html"> Création d'un client </a> : Enregistrement de
	données vers la base de données.
	<br>

	<p />

</body>
</html>