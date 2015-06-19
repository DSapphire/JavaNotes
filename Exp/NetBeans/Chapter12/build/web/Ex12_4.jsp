<%@ page contentType="text/html; charset=gb2312"  %>
<html>
<head>
<title>使用JavaBean</title>
</head>
<body>  
   <form name="form1" method="post" action="">
    <br>姓名：<input type="text" name="name">
	<br>性别：<input type="radio" name="male" value="true">  男
    	<input type="radio" name="male" value="false"> 女
    <br>编号：<input type="text" name="id">
    <br>职务: <input type="text" name="occupation">
    <br>工资：<input type="text" name="salary">
    <br><input type="submit" name="Submit" value="提交">
   </form>
     
   <jsp:useBean id="employee" class="myBeans.EmployeeBean" />
   <jsp:setProperty name="employee" property="name" param="name"  />
   <jsp:setProperty name="employee" property="id" param="id" />
   <jsp:setProperty name="employee" property="male" param="male" />
   <jsp:setProperty name="employee" property="salary" param="salary" />
   <jsp:setProperty name="employee" property="occupation" param="occupation" />
   <P>名字是：<jsp:getProperty name="employee" property="name" /> </P>
   <p>编号是：<jsp:getProperty name="employee" property="id" /> </p>
   <p>是否男性？<jsp:getProperty name="employee" property="male" /> </p>
   <p>工资是：<jsp:getProperty name="employee" property="salary" />元 </p>
   <p>职务是：<jsp:getProperty name="employee" property="occupation" /> </p>    
</body>
</html>
