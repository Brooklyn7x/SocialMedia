<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.ArrayList"%>
 <%@ page import="com.faceweb.enity.faceuser" %>
 <%@ page import="com.faceweb.enity.friendlist" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gg</title>
</head>
<body>
	<%
	ArrayList<friendlist> fl =(ArrayList<friendlist>)request.getAttribute("friends");
					
				for(friendlist fu:fl){ %>
				<br>---------------------------------
				    <form method=post action=confirmfriends>
				        <label><%= fu.getReceiverfrinend() %></label><br>
				        <input type=hidden name="em" value=<%= fu.getReceiverfrinend() %>>
				        <input type=submit value="Confirm Friend">
				    </form>
				<%}

				%>
				
				
</body>
</html>