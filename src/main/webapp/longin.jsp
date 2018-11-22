<%--
  Created by IntelliJ IDEA.
  User: iamvi
  Date: 2018/11/22
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Login.do" method="post">
    <!--这里的uerName和passWord要和bean中的一模一样-->
    username:
    <input type="text" name="userName">用户名</input>
    password:
    <input type="text" name="passWord">密码</input></br>
    <input type="submit" value="提交">
    </form>
</body>

</html>
