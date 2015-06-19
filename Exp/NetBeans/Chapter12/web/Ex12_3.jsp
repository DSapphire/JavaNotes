<%@ page contentType="text/html; charset=gb2312"  %>
<html>
<head>
<title>使用JavaBean</title>
</head>
<body>
   <jsp:useBean id="employee" class="myBeans.EmployeeBean" />
   <H2>初始值：</h2>   
   <P>名字是：<jsp:getProperty name="employee" property="name" /> </P>
   <p>编号是：<jsp:getProperty name="employee" property="id" /> </p>
   <p>是否男性？<jsp:getProperty name="employee" property="male" /> </p>
   <p>工资是：<jsp:getProperty name="employee" property="salary" />元 </p>
   <p>职务是：<jsp:getProperty name="employee" property="occupation" /> </p> 
   
   <H2>修改后：</h2>  
   <jsp:setProperty name="employee" property="name" value="超杰" />
   <jsp:setProperty name="employee" property="id" value="1" />
   <jsp:setProperty name="employee" property="male" value="true" />
   <jsp:setProperty name="employee" property="salary" value="6000" />
   <jsp:setProperty name="employee" property="occupation" value="Manager" />
   <P>名字是：<jsp:getProperty name="employee" property="name" /> </P>
   <p>编号是：<jsp:getProperty name="employee" property="id" /> </p>
   <p>是否男性？<jsp:getProperty name="employee" property="male" /> </p>
   <p>工资是：<jsp:getProperty name="employee" property="salary" />元 </p>
   <p>职务是：<jsp:getProperty name="employee" property="occupation" /> </p> 
   
</body>
</html>
