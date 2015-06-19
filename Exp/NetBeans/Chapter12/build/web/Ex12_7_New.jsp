<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
    <%@ taglib uri="/WEB-INF/tlds/NewExample" prefix="testTag" %>
    <title>使用标签<testTag:newexample/></title>
</head>
<body>
    <UL>
        <Br>使用默认范围：<testTag:newexample/>
        <Br>1000以内：<testTag:newexample range="1000" />
        <Br>10000以内：<testTag:newexample range="10000" />
    </UL>
</body>

</html>