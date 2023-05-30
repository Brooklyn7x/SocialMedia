<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
 <%@ page import="com.faceweb.enity.faceuser" %>
 <%@ page import="com.faceweb.enity.friendlist" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>____</title>
</head>
<body>
<%              String email = session.getAttribute("userid").toString();
%>
	 			<br>Welcome <%= email %>
	 			
	 			
				<br><a href=viewprofileservlet>View profile</a> 
				<br><a href=edit.html>Edit profile</a> 
				<br><a href=deleteprofileservlet>Delete profile</a>
				<br><a href=search.html>Search profile</a> 
				<br><a href=viewallprofile>View all profile</a> 
				<br><a href=friendslist>Pending Friends Requests</a> 
				<br><a href=messages>Message</a> 
				<br><a href=acceptfriends>Friends Requests</a> 
				<br><a href=RealFriendsList>Friends</a> 
				<br><a href=logoutservrlet>Logout</a>
				
				
				
				
				<%
				ArrayList<faceuser> fv =(ArrayList<faceuser>)request.getAttribute("userlist");
					
				for(faceuser fu:fv){ %>
				<br>---------------------------------
				    <form method=post action=addfriends>
				        <label><%= fu.getName() %></label><br>
				        <input type=hidden name="em" value=<%= fu.getEmail() %>>
				        <input type=hidden name="em" value=<%= fu.getName() %>>
				        <input type=submit value="Add Friend">
				    </form>
				<%}

				%>
				
				
				<br>----------------------------------+++++++++++++++++-----------------------------------------
				
				
				
				
</html>