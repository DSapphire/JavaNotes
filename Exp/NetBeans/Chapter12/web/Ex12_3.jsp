<%@ page contentType="text/html; charset=gb2312"  %>
<html>
<head>
<title>ʹ��JavaBean</title>
</head>
<body>
   <jsp:useBean id="employee" class="myBeans.EmployeeBean" />
   <H2>��ʼֵ��</h2>   
   <P>�����ǣ�<jsp:getProperty name="employee" property="name" /> </P>
   <p>����ǣ�<jsp:getProperty name="employee" property="id" /> </p>
   <p>�Ƿ����ԣ�<jsp:getProperty name="employee" property="male" /> </p>
   <p>�����ǣ�<jsp:getProperty name="employee" property="salary" />Ԫ </p>
   <p>ְ���ǣ�<jsp:getProperty name="employee" property="occupation" /> </p> 
   
   <H2>�޸ĺ�</h2>  
   <jsp:setProperty name="employee" property="name" value="����" />
   <jsp:setProperty name="employee" property="id" value="1" />
   <jsp:setProperty name="employee" property="male" value="true" />
   <jsp:setProperty name="employee" property="salary" value="6000" />
   <jsp:setProperty name="employee" property="occupation" value="Manager" />
   <P>�����ǣ�<jsp:getProperty name="employee" property="name" /> </P>
   <p>����ǣ�<jsp:getProperty name="employee" property="id" /> </p>
   <p>�Ƿ����ԣ�<jsp:getProperty name="employee" property="male" /> </p>
   <p>�����ǣ�<jsp:getProperty name="employee" property="salary" />Ԫ </p>
   <p>ְ���ǣ�<jsp:getProperty name="employee" property="occupation" /> </p> 
   
</body>
</html>
