<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.faceweb.enity.friendlist" %>
    <%@page import="java.util.ArrayList"%>
    <%@ page import="com.faceweb.enity.faceuser" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<friendlist> fl =(ArrayList<friendlist>)request.getAttribute("friendlist");
					
				for(friendlist fu:fl){ %>
				<br>---------------------------------
				    <form method=post action=deletefriends>
				        <label><%= fu.getReceiverfrinend() %></label><br>
				        <input type=hidden name="em" value=<%= fu.getReceiverfrinend() %>>
				        <input type=submit value="Delete Request">
				    </form>
				<%}

				%>
				
	
				
	
</body>
</html>