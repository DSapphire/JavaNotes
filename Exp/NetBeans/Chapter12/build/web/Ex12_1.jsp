<%-- pageָ���ǩ��ָ��MIME���ͺ�ҳ����ַ����� --%>
<%@ page contentType="text/html; charset=gb2312" %>
<%-- ����һ���෽�����÷���������JSPҳ����Ч --%>
<%!
   int continuousSum(int n)
   {
       int sum=0;
	   for(int i=1;i<=n;i++)
	   {
	    sum=sum+i;
	   }
	   return sum;
    }
%>	
<%-- JSP�е�Java����Ƭ������JSP���水˳��ִ�� --%>
<%
    String str=request.getParameter("number");
    if(str==null) str="10";
    int r=Integer.parseInt(str);
%>
<html>
<head>
<title>����������</title>
</head>
<body>
<h1>������һ����Ȼ��</h1>
<!-- HTML�� -->
<form name="form1" method="post" action="">
  <input type="text" name="number" value=<%=str%>>
  <input type="submit" name="Submit" value="����">
</form>      		
<%-- JSP���ʽ����ֵ�ɷ�����������㣬����������ؿͻ�����ʾ --%>
<%= r %>����������<%=continuousSum(r) %>
</body>
</html>
