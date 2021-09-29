<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 6:22:16 PM
    Author     : 733357
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGE CALCULATOR</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action='age' method='post'>
                Enter your age here: <input input name="age"  type="text" ><b> <input type="submit" value="Age next birthday">
            </form>
            <div>${mAge}</div>
            
            
        </div>
    </body>
</html>
