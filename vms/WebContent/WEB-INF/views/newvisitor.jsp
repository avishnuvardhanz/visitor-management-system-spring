 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style> 
input[type=button],input[type=submit]{
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
<meta charset="ISO-8859-1">
<meta http-equiv="cache-control" content="private, max-age=0, no-cache">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="expires" content="0">
<title>new/edit visitor</title>
<link href="resources/input.css" rel="stylesheet" type="text/css" />
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
       
       <body>
<div>
<h1>Add New Visitor</h1>

 <form:form action="save" method="post" modelAttribute="visitor">
 
 			
 		
 			<form:hidden path="id"/>
 				<div class="inputWithIcon">
 					<form:input path="visitorname" placeholder="Visitor Name" />
          				 <i class="fa fa-user fa-lg fa-fw"></i>
				</div>
            
          
 				<div class="inputWithIcon">
 					<form:input path="mobilenumber" placeholder="Mobile Number" />
          				 <i class="fas fa-phone-alt"></i>
				</div>
            
            
               <div class="inputWithIcon">
 					<form:input path="address" placeholder="Visitor Address" />
          				 <i class="fas fa-address-card"></i>
				</div>
            
            
               <div class="inputWithIcon">
 					<form:input path="apartment" placeholder="Apartment" />
          				<i class="fas fa-building"></i>
				</div>
            
             
                <div class="inputWithIcon">
 					<form:input path="floor" placeholder="Floor" />
          				<i class="fas fa-building"></i>
				</div>
            
             
              <div class="inputWithIcon">
 					<form:input path="whomtomeet" placeholder="Whom to Meet" />
          				<i class="fal fa-people-arrows"></i>
				</div>
             
             <div class="inputWithIcon">
 					<form:input path="reasontomeet" placeholder="Reason to Meet" />
          			<i class="fal fa-people-arrows"></i>
				</div>
            

 <input type="submit" value="Save"/>

 

 
 
 </form:form>
 </div>
</body>
    
    </div>
     
       
      
</div>
</div>

   

</body>


</html>
