<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h2><spring:message code="new.product"/></h2>

<form:form method="POST" action="${pageContext.request.contextPath}/product/save" commandName="product" id="formProduct">
	<table>
		<tr>
			<td><form:label path="SKU">SKU</form:label></td>
			<td><form:input type="text" name="SKU" path="SKU" /></td>
		</tr>
		<tr>
			<td><form:label path="name">Nombre</form:label></td>
			<td><form:input type="text" name="name" path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="color">Color</form:label></td>
			<td><form:input type="text" name="color" path="color" /></td>
		</tr>
		<tr>
			<td><form:label path="size">Talla</form:label></td>
			<td><form:input type="text" name="size" path="size" /></td>
		</tr>
		<tr>
			<td colspan="2">
			<input id="btnGrabar" type="submit" value="Grabar" />
			<div id="mensajeGuardo" style="display: none">
				<span>Se guardó correctamente</span>
			</div>
			</td>
		</tr>	
	</table>
</form:form>

<script src="${pathProperties['instance.url.resource.administrator']}/js/jquery/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="${pathProperties['instance.url.resource.administrator']}/form/form-product.js"></script>
<script>
	$(document).ready(function() {
		var product = new Product();
		product.init();
	});
</script>
