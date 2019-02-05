<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<html>
  <head>
  <meta charset="UTF-8">
  <title>Saúde Ocupacional - Solicitação de Exame</title>
</head>
<body>
<s:form action="inserirExame">
	<s:select label="Tipo de Exame" 
		headerKey="-1" headerValue="Selecione um tipo de exame"
		list="selectTiposExames" 
		listKey = "id" 
	    	listValue = "descricao" 
		name="tipoExame.descricao" />
		
	<s:select label="Funcionário" 
		headerKey="-1" headerValue="Selecione um funcionário"
		list="selectFuncionarios" 
		listKey = "id" 
	    	listValue = "nome" 
		name="funcionario.nome" />
  
  <s:date name="funcionario.dataNascimento" format="dd/MM/yyyy" />
  
  <s:submit value="Solicitar" />
</s:form>
</body>
</html>