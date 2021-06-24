<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="resources/table2.css" rel="stylesheet" type="text/css" />
 	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	 	 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>

            <h1>REPORT FROM ${txt1} TO ${txt2}</h1>
         
     
        <div class="container" align="center">
        
        <p>
        <button class="btn">PrintTable</button>
        </p>
        <table class="table" id="table">
          
        <thead>
          <tr>
                <th>No</th>
                <th>VisitorName</th>
                <th>MobileNumber</th>
                <th>Address</th>
                <th>Apartment</th>
                <th>Floor</th>
                <th>WhomToMeet</th>
                <th>ReasontoMeet</th>
                <th>Remark</th>
                 <th>Entry Time & Date from ${txt1}to${txt2}</th>
                 <th>Leave Time & Date</th>
               </tr> 
        
        
        
        </thead>
        
        <tbody>
           
            <c:forEach var="visitor" items="${listVisitor}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${visitor.visitorname}</td>
                    <td>${visitor.mobilenumber}</td>
                  <td>${visitor.address}</td>
                  <td>${visitor.apartment}</td>
                  <td>${visitor.floor}</td>
                  <td>${visitor.whomtomeet}</td>
                  <td>${visitor.reasontomeet}</td>
                   <td>${visitor.remark}</td>
           			 <td>${visitor.enterdate}</td>
           			  <td>${visitor.outtime}</td>
				  </tr>
                </c:forEach>    
        
        
        
        
        
        </tbody>
        
        </table>
        
        </div>
        
        <script src="jquery.min.js"></script>
        <script>
        $('.btn').click(function(){
        	 var printme=document.getElementById('table');
        	 var wme=window.open("","","width=900,height=700");
        	 wme.document.write(printme.outerHTML);
        	 wme.document.close();
        	 wme.focus();
        	 wme.print();
        	 wme.close()
        })
        
        
        
        </script>
</body>
</html>