<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 29, 2021, 5:24:31 PM
    Author     : 733357
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            first: <input name="first" type="text" value="${first}"><br>
            Second: <input name="second" type="text" value="${second}"><br>
            <input name="calculate" value="+" type="submit">
            <input name="calculate" value="-" type="submit">
            <input name="calculate" value="*" type="submit">
            <input name="calculate" value="%" type="submit">

        </form>
            <div>Result: ${results}</div>
            <a href="age"> Age Calculator</a>
    </body>
</html>
