<%--
  Created by IntelliJ IDEA.
  User: BG241127
  Date: 2016/6/14
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body>
<table>
  <tr>
    <th>学号</th>
    <th>姓名</th>
    <th>年龄</th>
    <th>性别</th>
  </tr>
  <c:forEach items="${studentInfoList}" var = "studentInfo">
    <tr>
      <td>${studentInfo.id}</td>
      <td>${studentInfo.name}</td>
      <td>${studentInfo.age}</td>
      <td>${studentInfo.sex}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
