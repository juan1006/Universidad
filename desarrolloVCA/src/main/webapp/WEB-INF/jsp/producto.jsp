<%@ include file="/common/tagLibs.jsp"%>

<body>

<div class="container-fluid">
  <div class="page-title">
    <h1> Producto </h1>
  </div>
  <div class="row">
    <div class="form-group">
      <div class="col-lg-6">
        <select class="form-control">
          <option value="Category 1">Buscar por nombre</option>
          <option value="Category 2">Buscar por codigo</option>
          <option value="Category 3">Buscar por estado</option>
        </select>
      </div>
      <div class="col-lg-5">
        <input class="form-control" placeholder="Texto a buscar" type="text"/>
      </div>
    </div>
    <div class="col-lg-1">
      <button class="btn btn-primary">Buscar</button>
    </div>
  </div>

  <div class="row">
    <div class="col-lg-12">
      <div class="widget-container fluid-height clearfix">
        <div class="widget-content padded clearfix">
          <table class="table table-bordered table-striped" id="dataTable1">
            <thead>
            <th class="check-header hidden-xs"></th>
              <th> SKU </th>
              <th> Descripcion </th>
              <th class="hidden-xs"> Talla </th>
              <th class="hidden-xs"> color </th>
              <th class="hidden-xs"> Estado </th>
              <th></th>
              </thead>
            <tbody>
            <c:forEach var="producto" items="${listarProducto}">						
              <tr>
                <td class="check hidden-xs"><input name="optionsRadios1" type="checkbox" value="option1"/></td>
                <td><c:out value="${producto.SKU}"/></td>                
                <td><c:out value="${producto.descripcion}"/></td>
                <td class="hidden-xs"><c:out value="${producto.talla.nombreTalla}"/> </td>
                <td class="hidden-xs"><c:out value="${producto.color.nombreColor}"/></td>
                <c:if test="${producto.estado}">
                <td class="hidden-xs"><span class="label label-success">Activo</span></td>														
				</c:if>
				<c:if test="${not producto.estado}">
				<td class="hidden-xs"><span class="label label-danger">Eliminado</span></td>			
				</c:if>                
                <td class="actions"><div class="action-buttons"><a class="table-actions" href="tables-2.html"><i class="icon-eye-open"></i></a><a class="table-actions" href="tables-2.html"><i class="icon-pencil"></i></a><a class="table-actions" href="tables-2.html"><i class="icon-trash"></i></a></div></td>
             </tr>								
			</c:forEach>             
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>

</div>
</body>