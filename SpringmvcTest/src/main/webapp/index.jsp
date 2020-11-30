<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/11/3
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<a href="/test/some.do">发起some.do请求</a>

<form action="/test/some.do" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
   <input type="submit" value="post请求">
</form>
<br>
<a href="/test/json.do">请求String</a>
<br>
<a href="/test/json1.do">请求list形式</a>
<br>
<a href="/test/json2.do">请求时间形式</a>
<br>
<a href="/show.html">请求列表形式</a>
<br>
<a href="/show.html">请求json简易版</a>
<br>
<a href="/show.html">fastjson请求</a>
</body>

</html>
