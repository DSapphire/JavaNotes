<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<title>在session中传递变量</title>
</head>
<body>
<jsp:useBean id="employee" type="myBeans.EmployeeBean" scope="session" />
<H2>
员工姓名：<jsp:getProperty name="employee" property="name" />
<br>员工编号：<jsp:getProperty name="employee" property="id" />
</H2>
</body>
</html>

