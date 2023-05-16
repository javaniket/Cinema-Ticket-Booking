<%-- 
    Document   : adminpanel
    Created on : 12-Apr-2023, 2:01:31 pm
    Author     : acedi
--%>
<%@page import="com.cinematicket.connection.ConnectionDBS" %>
<% ConnectionDBS dbs = new ConnectionDBS(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= dbs.getCon() %>
    </body>
</html>
