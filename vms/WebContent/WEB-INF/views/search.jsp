<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<div class="row">
    <form  action="visitor_search">
    
    <input type="text" name="freeText" />
    <button>find</button>
    <div align="center">
            <h1>MANAGE VISITORS</h1>
         
            <table border="1">
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
                 
               </tr> 
              
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
                 
               </tr>
                </c:forEach>    
                       
            </table>
        </div>
    
      
    
    </form>

</div>