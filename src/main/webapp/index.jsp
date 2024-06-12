<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Page de connexion</title>
</head>
<body>
<center>
<h2>Veuillez vous connecter.</h2>
<form action="login" method="post">
  <label for="name">Identifiant:</label>
  <input type="text" id="name" name="name" required>
  <br>
  <label for="pass">Mot de passe:</label>
  <input type="password" id="pass" name="pass" required>
  <br><br>
  <button type="submit">Login</button>
</form>
</center>
</body>
</html>
