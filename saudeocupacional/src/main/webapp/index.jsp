<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<html>
  <head>
  <meta charset="UTF-8">
  <title>Saúde Ocupacional - Exames</title>
</head>
<body>
<h1>Exames solicitados</h1>
<p><a href="<s:url action='solicitarExame'/>">Solicitar Exame</a></p>
<s:iterator value="exames">
  <li><s:property /></li>
</s:iterator>
</body>
</html>