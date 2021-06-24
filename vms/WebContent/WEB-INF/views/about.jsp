<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resources/table.css" rel="stylesheet" type="text/css" />
 	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	 	 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>

<div class="wrapper">
    <div class="sidebar">
        <h2>VMS</h2>
        <ul>
            <li><a href="dashboardcall"><i class="fas fa-tachometer-alt"></i>DASHBOARD</a></li>
            <li><a href="newvisitorcall"><i class="fas fa-user"></i>NEW VISITOR</a></li>
            <li><a href="managevisitorcall"><i class="fas fa-user-clock"></i>MANAGE VISITOR</a></li>
            <li><a href="datesort"><i class="fas fa-search"></i>SEARCH DATES</a></li>
            <li><a href="about"><i class="fas fa-address-card"></i>ABOUT</a></li>
          
        </ul> 
      
    </div>
    <div class="main_content">
      <form  action="visitor_search">
        <div class="header">VISITOR MANAGEMENT SYSTEM 
         <div class="search-box">
        <input class="search-txt" name="freeText" placeholder="SEARCH BY NAME">
        <a class="search-btn" href="#">   
        <i class="fas fa-search"></i>
        </a>
        </div>
         
  
        
        
        </div>  
        </form>
        <div class="info">
       <div align="center">
          
   <h1>THIS APPLICATION IS TO MAINTAIN THE RECORD OF THE VISITORS</h1>
   <h3> DEVELOPED BY VISHNUVARDHAN</h3>
        </div>
       
    
    </div>
      

</div>
</div>

   
  
</body>

<body>
 
</body>
</html>
