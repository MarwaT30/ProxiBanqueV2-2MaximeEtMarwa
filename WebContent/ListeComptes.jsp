<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Liste des Comptes</title>
</head>
<body>
	<img src="logoProxiBanque.png">

	<h1>Affichage de la liste des comptes</h1>



	<c:forEach items="${comptes}" var="com">

		${com.idCompte} ${com.numeroCompte}
	</c:forEach>


	<p />
	<h4>Page en cours de développement, revenez plus tard !</h4>

	<h3>
		Retour à la <a href=Accueil.html> page </a> d'accueil.
	</h3>
</body>
</html>