<%@ page contentType="text/html; charset=gb2312"  %>
<html>
<head>
<title>ʹ��JavaBean</title>
</head>
<body>  
   <form name="form1" method="post" action="">
    <br>������<input type="text" name="name">
	<br>�Ա�<input type="radio" name="male" value="true">  ��
    	<input type="radio" name="male" value="false"> Ů
    <br>��ţ�<input type="text" name="id">
    <br>ְ��: <input type="text" name="occupation">
    <br>���ʣ�<input type="text" name="salary">
    <br><input type="submit" name="Submit" value="�ύ">
   </form>
     
   <jsp:useBean id="employee" class="myBeans.EmployeeBean" />
   <jsp:setProperty name="employee" property="name" param="name"  />
   <jsp:setProperty name="employee" property="id" param="id" />
   <jsp:setProperty name="employee" property="male" param="male" />
   <jsp:setProperty name="employee" property="salary" param="salary" />
   <jsp:setProperty name="employee" property="occupation" param="occupation" />
   <P>�����ǣ�<jsp:getProperty name="employee" property="name" /> </P>
   <p>����ǣ�<jsp:getProperty name="employee" property="id" /> </p>
   <p>�Ƿ����ԣ�<jsp:getProperty name="employee" property="male" /> </p>
   <p>�����ǣ�<jsp:getProperty name="employee" property="salary" />Ԫ </p>
   <p>ְ���ǣ�<jsp:getProperty name="employee" property="occupation" /> </p>    
</body>
</html>
