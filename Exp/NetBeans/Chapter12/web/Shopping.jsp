<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<title>��ӭ�����������</title>
</head>
<body>
<h1>�������
</h1>
<table width="706" border="1">
    <tr align="center" valign="middle" bgcolor="#CCCCCC">
        <th width="180" scope="col">����</th>
        <th width="131" scope="col">����</th>
        <th width="122" scope="col">������</th>
        <th width="85" scope="col">�۸�</th>
        <th width="65" scope="col">����</th>
        <th width="83" scope="col">&nbsp;</th>
    </tr>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>Java���˼��</td>
        <td> ���</td>
        <td>��е��ҵ������</td>
        <td>99</td>    
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="����"></td>    
    </tr>
        <input type="hidden" name="name" value="Java���˼��">
        <input type="hidden" name="author" value="���">
        <input type="hidden" name="publisher" value="��е">
        <input type="hidden" name="price" value="99">
        <input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>Java Applet���ʵ��</td>
        <td>��÷</td>
        <td>�廪��ѧ������</td>
        <td>36</td>  
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="����"></td>    
    </tr>
        <input type="hidden" name="name" value="Java Applet���ʵ��">
	<input type="hidden" name="author" value="��÷">
	<input type="hidden" name="publisher" value="�廪">
	<input type="hidden" name="price" value="36">
	<input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>JSP�����̳�</td>
        <td>������</td>
        <td>�廪��ѧ������</td>
        <td>22</td>
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="����"></td>    
    </tr>
        <input type="hidden" name="name" value="JSP�����̳�">
        <input type="hidden" name="author" value="����">
        <input type="hidden" name="publisher" value="�廪">
        <input type="hidden" name="price" value="22">
        <input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>JSP�߼�������Ӧ��</td>
        <td>David</td>
        <td>��ѧ������</td>
        <td>42</td>
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="����"></td>    
    </tr>
        <input type="hidden" name="name" value="JSP�߼�������Ӧ��">
	<input type="hidden" name="author" value="David">
	<input type="hidden" name="publisher" value="��ѧ">
	<input type="hidden" name="price" value="42">
	<input type="hidden" name="action" value="ADD">
    </form>  
</table>
<form name="checkoutForm" method="post" action="/Chapter12/ShoppingServlet">
    <input type="submit" name="submit" value="����">
    <input type="hidden" name="action" value="CHECKOUT">
</form>
</body>
</html>