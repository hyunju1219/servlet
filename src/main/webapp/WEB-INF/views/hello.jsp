<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello jsp</h1>
	<%
		//스크립트릿 : 자바문법 사용
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		//스크립트릿에서 작성된 변수를 html태그 안에서 사용하고 싶으면 표현식 사용<%=
	%>
	<h2><%=name %></h2>
	<h2><%=age %></h2>
</body>
</html>