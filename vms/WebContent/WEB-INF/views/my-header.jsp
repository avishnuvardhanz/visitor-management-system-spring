<html xmlns="http://www.w3.org/1999/xhtml">
 <%
try
{response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    String game=session.getAttribute("username").toString();
  
}
catch(Exception ex)
{
    
    
}

 %>
<head>
    <title>Home</title>
    <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
</head>
<body>
   <h2>${username}</h2>
  
    <a href="dm1">Logout</a>
</body>
</html>

 



 


 