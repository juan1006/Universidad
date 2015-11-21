<%@ include file="/common/tagLibs.jsp"%>

<body>
<div class="container-fluid">
  <div class="page-title">
    <h1>Nuevo producto </h1>
  </div>
  <div class="row">
    <div class="col-lg-12">
      <div class="widget-container fluid-height clearfix">
        <div class="widget-content padded">
          <div class="col-lg-12">
           <form:form id="registroP" method="post"
								action="producto_registrar.htm" commandName="producto"
								class="form-horizontal">
              <div class="form-group">
                <label class="control-label col-lg-3">Descripcion</label>
                <div class="col-lg-9">
                  <form:input class="form-control" id="descripcion"
											name="descripcion" path="descripcion" />
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Color</label>
                <div class="col-lg-9">
					<form:select cssClass="form-control" path="color.codColor" items="${listaColor}" />
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Talla</label>
                <div class="col-lg-9">
					<form:select cssClass="form-control" path="talla.codTalla" items="${listaTalla}" />
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Costo</label>
                <div class="col-lg-9">
                  <form:input class="form-control" id="costo"
											name="costo" path="costo" />
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Precio</label>
                <div class="col-lg-9">
                  <form:input class="form-control" id="precio"
 											name="precio" path="precio" /> 
                </div>
              </div>
              <div class="form-actions col-lg-offset-3 col-lg-9">
                <button class="btn btn-primary" type="submit">Crear</button>
                <button class="btn btn-default-outline">Cancelar</button>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</body>