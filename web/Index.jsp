<%-- 
    Document   : Index
    Created on : Nov 17, 2016, 3:58:43 PM
    Author     : dssupport
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculating Stuff</title>
    </head>
    <body>
        <form method="post" action="./CalculateServlet">
            Number 1: <input type="text" name="NumberOne" value="${NumberOne}"><br>
            Number 2: <input type="text" name="NumberTwo" value="${NumberTwo}"><br>
            <br>
            <input type="submit" value="Go">
            <br>
            <br>
        </form>
        <div id="Answer">${strAnswer}</div>
    </body>
</html>