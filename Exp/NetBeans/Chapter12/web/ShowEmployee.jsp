<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<title>��session�д��ݱ���</title>
</head>
<body>
<jsp:useBean id="employee" type="myBeans.EmployeeBean" scope="session" />
<H2>
Ա��������<jsp:getProperty name="employee" property="name" />
<br>Ա����ţ�<jsp:getProperty name="employee" property="id" />
</H2>
</body>
</html>

