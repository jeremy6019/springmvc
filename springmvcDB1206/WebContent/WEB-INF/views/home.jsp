<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item</title>
<link rel="stylesheet"  href="./css/home.css">
</head>
<body>
<!-- JSTL의 Core기능을 사용하기 위한 태그 라이브러리 설정  -->
<%@taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
           <div align='center' class='body'>
           		<h2>상품목록</h2>
           		<table border="2">
           				<tr class='header'>
           						<th width="100"  height="30">상품 ID</th>
           						<th width="300" >상품 이름</th>
           						<th width="100" >가격</th>           						
           				</tr>
           				<c:forEach var="item" items="${list}">
           					<tr class='record'>
           						<td align='center'  height="30">${item.itemid}</td>
           						<td align='center'>&nbsp;&nbsp;<a href="detail/${item.itemid}">${item.itemname}</a></td>
           						<td align='right'>${item.price}원&nbsp;&nbsp;</td>
           					</tr>	
           				</c:forEach>		
           		</table>
           	</div>	
</body>
</html>