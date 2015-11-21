<%@ include file="/common/tagLibs.jsp"%>
<body>
<div class="container-fluid">
  <div class="page-title">
    <h1> Cliente </h1>
  </div>
  <div class="row">
    <div class="form-group">
      <div class="col-lg-6">
        <select class="form-control">
          <option value="Category 1">Buscar por nombre</option>
          <option value="Category 2">Buscar por DNI</option>
          <option value="Category 3">buscar por RUC</option>
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
              <th> Nombre </th>
              <th> Apellido paterno </th>
              <th class="hidden-xs"> Correo </th>
              <th class="hidden-xs"> Fecha </th>
              <th class="hidden-xs"> Estado </th>
              <th></th>
              </thead>
            <tbody>
              <c:forEach var="cliente" items="${listaCliente}">						
              <tr>
                <td class="check hidden-xs"><input name="optionsRadios1" type="checkbox" value="option1"/></td>
                <td><c:out value="${cliente.primerNombre}"/></td>                
                <td><c:out value="${cliente.primerApellido}"/></td>
                <td class="hidden-xs"><c:out value="${cliente.correo}"/> </td>
                <td class="hidden-xs"><c:out value="${cliente.fechaCreacion}"/></td>
                <c:if test="${cliente.estado}">
                <td class="hidden-xs"><span class="label label-success">Activo</span></td>														
				</c:if>
				<c:if test="${not cliente.estado}">
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