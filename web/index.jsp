<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-3-5
  Time: 下午1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="/LogionServlet2?username=马欢&&password=张三">get方式提交数据</a>
  <form action="/LogionServlet2" method="get">
    <input type="text" name="username"/><br>
    <input type="password" name="password"/><br>
    <input type="submit" value="登录"/>
  </form>
  $END$
  </body>
</html>
