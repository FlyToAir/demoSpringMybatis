<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: BG241127
  Date: 2016/6/13
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action = "addStudent" method="post">
    <table>
      <tr>
<%--        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id"/></td>--%>
        <th>学号</th>
        <td><input type = "text" name = "id" value = "${studentInfo.id}"/></td>
      </tr>
      <tr>
        <%--<td><form:label path="name">name</form:label></td>--%>
        <%--<td><form:input path="name"/></td>--%>
        <th>姓名</th>
        <td><input type = "text" name = "name" value = "${studentInfo.name}"/></td>
      </tr>
      <tr>
        <%--<td><form:label path="age">age</form:label></td>--%>
        <%--<td><form:input path="age"/></td>--%>
        <th>年龄</th>
        <td><input type="text" name ="age" value = "${studentInfo.age}"/></td>
      </tr>
      <tr>
        <%--<td><form:label path="sex">sex</form:label></td>--%>
        <%--<td><form:input path="sex"/></td>--%>
        <th>性别</th>
        <td><input type = "text" name = "sex" value = "${studentInfo.sex}"></td>
      </tr>
      <tr>
        <td colspan="2" align = "center"><input type="submit" value = "提交"></td>
      </tr>
    </table>
  </form>
</body>
</html>
