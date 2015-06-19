<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<title>欢迎光临网络书店</title>
</head>
<body>
<h1>网络书店
</h1>
<table width="706" border="1">
    <tr align="center" valign="middle" bgcolor="#CCCCCC">
        <th width="180" scope="col">书名</th>
        <th width="131" scope="col">作者</th>
        <th width="122" scope="col">出版社</th>
        <th width="85" scope="col">价格</th>
        <th width="65" scope="col">数量</th>
        <th width="83" scope="col">&nbsp;</th>
    </tr>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>Java编程思想</td>
        <td> 侯捷</td>
        <td>机械工业出版社</td>
        <td>99</td>    
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="购买"></td>    
    </tr>
        <input type="hidden" name="name" value="Java编程思想">
        <input type="hidden" name="author" value="侯捷">
        <input type="hidden" name="publisher" value="机械">
        <input type="hidden" name="price" value="99">
        <input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>Java Applet编程实例</td>
        <td>何梅</td>
        <td>清华大学出版社</td>
        <td>36</td>  
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="购买"></td>    
    </tr>
        <input type="hidden" name="name" value="Java Applet编程实例">
	<input type="hidden" name="author" value="何梅">
	<input type="hidden" name="publisher" value="清华">
	<input type="hidden" name="price" value="36">
	<input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>JSP基础教程</td>
        <td>耿祥义</td>
        <td>清华大学出版社</td>
        <td>22</td>
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="购买"></td>    
    </tr>
        <input type="hidden" name="name" value="JSP基础教程">
        <input type="hidden" name="author" value="耿祥">
        <input type="hidden" name="publisher" value="清华">
        <input type="hidden" name="price" value="22">
        <input type="hidden" name="action" value="ADD">
    </form>
    <form name="shoppingForm" method="post" action="/Chapter12/ShoppingServlet">
    <tr align="center" valign="middle">
        <td>JSP高级开发与应用</td>
        <td>David</td>
        <td>科学出版社</td>
        <td>42</td>
        <td><input type="textfield" name="quantity" value="1" size="3"> </td>
        <td><input type="submit" name="Submit" value="购买"></td>    
    </tr>
        <input type="hidden" name="name" value="JSP高级开发与应用">
	<input type="hidden" name="author" value="David">
	<input type="hidden" name="publisher" value="科学">
	<input type="hidden" name="price" value="42">
	<input type="hidden" name="action" value="ADD">
    </form>  
</table>
<form name="checkoutForm" method="post" action="/Chapter12/ShoppingServlet">
    <input type="submit" name="submit" value="结帐">
    <input type="hidden" name="action" value="CHECKOUT">
</form>
</body>
</html>