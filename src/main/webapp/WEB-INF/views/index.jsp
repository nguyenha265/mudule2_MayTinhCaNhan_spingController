<%--
  Created by IntelliJ IDEA.
  User: nguyenha265
  Date: 30/07/2019
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form method="get" action="/calculator">
  <h1>Calculator</h1>
  <table>
    <tr>
      <th><input type="text" name="number1"></th>
      <th><input type="text" name="number2"></th>
    </tr>
    <tr>
      <th><input type="submit" name="operator" value="Addition(+)"></th>
      <th><input type="submit" name="operator" value="Subtraction(-)"></th>
      <th><input type="submit" name="operator" value="Multiplication(X)"></th>
      <th><input type="submit" name="operator" value="Division(/)"></th>
    </tr>
  </table>
  <h2>${result}</h2>
</form>
  </body>
</html>
