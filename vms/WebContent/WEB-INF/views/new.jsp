<!DOCTYPE html>
<html lang="en">



<head>
	<meta charset="UTF-8">
	
	<title>VMS</title>
	 <link href="resources/style.css" rel="stylesheet" type="text/css" />
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
        <div class="header">VISITOR MANAGEMENT SYSTEM <jsp:include page="my-header.jsp"/>
         <div class="search-box">
        <input class="search-txt" name="freeText" placeholder="SEARCH BY NAME">
        <a class="search-btn" href="#">   
        <i class="fas fa-search"></i>
        </a>
        </div>
         
  
        
        
        </div>  
        </form>
        <div class="info">
       
       
    
    </div>
        <!--Widget Start-->
        <div class="card-body color1">
            <div class="float-left">
                <h3>
               
                    <span class="count">${message}</span>
                </h3>
                <p>TodayVisitors</p>
            </div>
           
        </div>
        <!--Widget End-->
     <!--Widget Start-->
        <div class="card-body color2">
            <div class="float-left">
                <h3>
                    <span class="count">${message1}</span>
                </h3>
                <p>Yesterday Visitor</p>
            </div>
        
        </div>
        <!--Widget End-->
         <!--Widget Start-->
        <div class="card-body color3">
            <div class="float-left">
                <h3>
                    <span class="count">${message2}</span>
                </h3>
                <p>Last 7 Days</p>
            </div>
           
        </div>
        <!--Widget End-->
          <!--Widget Start-->
        <div class="card-body color1">
            <div class="float-left">
                <h3>
                  
                    <span class="count">${message3}</span>
                </h3>
                <p>Total Visitors</p>
            </div>
           
        </div>
        <!--Widget End-->
</div>
</div>

   
  <script type="text/javascript">
        $('.count').each(function(){
            $(this).prop('Counter',0).animate({
                Counter: $(this).text()
            }, {
                duration:4000,
                easing:'swing',
                step: function(now){
                    $(this).text(Math.ceil(now));
                }
            });
        });
        </script>
</body>

</html>
