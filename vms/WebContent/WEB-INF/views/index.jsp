<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>VMS</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <form name="frm" action="login" method="post">
        <div class="login-box">
        <h1>VISITOR MANAGEMENT SYSTEM</h1>
            <h2>Login</h2>
            <div class="textbox">
                <i class="fas fa-user"></i>
                <input type="text" placeholder="Username" name="freeText" value="">
            </div>
            <div class="textbox">
                <i class="fas fa-key"></i>
                <input type="password" placeholder="Password" name="freeText1" value="">
            </div>
            
           <input class="btn" type="submit" name="" value="login">
          
        </div>
        
        </form>   
  <h3>${msg}</h3>    
    </body>
</html>


     
  