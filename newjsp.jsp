<%-- 
    Document   : newjsp
    Created on : 1 May, 2023, 10:38:46 AM
    Author     : Vishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%  
          webservice.NewWebService service = new webservice.NewWebService();
          webservice.NewWebService port = service;
        String s= port.operation("radha", "123");
         String s1= port.operation("sri", "123");
        if(s=="true")
        {
             out.println("<h1>"+s+"  The given name and password are valid");
        }
        else{
            out.println("<h1>"+s+"  The given name and password are invalid");
        }
        if(s1=="true")
        {
             out.println("<h1>"+s1+"  The given name and password are valid");
        }
        else{
            out.println("<h1>"+s1+"  The given name and password are invalid");
        }
       
        %>
    </body>
</html>
