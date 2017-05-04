<!-- 这是一个“页面指令” -->
<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

<!-- <% %> 标记里有一些标准Java代码（这称为scriptlet） -->
<%
    List styles = (List)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()) {
        out.print("<br>try: " + it.next());
    }
%>
</body>
</html>