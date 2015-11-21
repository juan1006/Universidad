<!DOCTYPE html>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
<title><tiles:getAsString name="titulo" /></title>
<link href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700" media="all" rel="stylesheet"/>
<%@ include file="/WEB-INF/include/libsCss.jsp"%>
<%@ include file="/WEB-INF/include/libsJs.jsp"%>
<meta content="width=device-width, initial-scale=1.0" charset="utf-8" name="viewport"/>
</head>
<body>
<div class="navbar navbar-fixed-top">
	<tiles:insertAttribute name="cabecera"/>
	
	<tiles:insertAttribute name="menu"/>
</div>
	
	<tiles:insertAttribute name="contenido"/>

</body>

</html>