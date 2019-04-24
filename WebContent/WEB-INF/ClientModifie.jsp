<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>client modifié</title>
</head>
<body>
<img src="logoProxiBanque.png">
<h1>Client Modifié</h1>

	<p />
	Nom : ${client.nom}
	<p />
	Prenom : ${client.prenom}
	<p />
	Rue : ${client.rue}
	<p />
	Code Postal : ${client.codePostal}
	<p />
	Ville : ${client.ville}
	<p />
	Numero Tel : ${client.numeroTel}
	<p />
	Mail : ${client.mail}
	<p />
	
<h3>Retour à la <a href=Accueil.html> page </a> d'accueil.</h3>
	


</body>
</html>