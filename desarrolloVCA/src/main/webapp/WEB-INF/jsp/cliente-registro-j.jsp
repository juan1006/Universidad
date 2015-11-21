<%@ include file="/common/tagLibs.jsp"%>

<body>
	<div class="container-fluid">
		<div class="page-title">
			<h1>Nuevo cliente juridico</h1>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="widget-container fluid-height clearfix">
					<div class="widget-content padded">
						<div class="col-lg-12">
							<form:form id="registro" method="post"
								action="cliente_registrar.htm" commandName="cliente"
								class="form-horizontal">
								<div class="form-group">
									<label class="control-label col-lg-3">Razón social</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="razonSocial"
											name="razonSocial" path="razonSocial" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">RUC</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="RUC" name="RUC"
											path="RUC" />
									</div>
								</div>
									<div class="form-group">
									<label class="control-label col-lg-3">Correo</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="correo"
											name="correo" path="correo" />
									</div>
								</div>
								<h3 class="pl-9">Representante legal</h3>
								<div class="form-group">
									<label class="control-label col-lg-3">Nombre</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="primerNombre"
											name="primerNombre" path="primerNombre" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">Apellido paterno</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="primerApellido"
											name="primerApellido" path="primerApellido" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">Apellido materno</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="segundoApellido"
											name="segundoApellido" path="segundoApellido" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">Sexo</label>
									<div class="col-lg-9">
										<label class="radio-inline"> <form:radiobutton
												path="sexo" value="1" /> Masculino
										</label> <label class="radio-inline"> <form:radiobutton
												path="sexo" value="0" /> Femenino
										</label>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">Documento de
										identidad</label>
									<div class="col-lg-9">
										<form:select cssClass="form-control" path="info1"
											items="${tipoIdentidadLista}" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-3">Número de
										documento de identidad</label>
									<div class="col-lg-9">
										<form:input class="form-control" id="dni" name="dni"
											path="DNI" />
									</div>
								</div>
								<form:hidden path="tipoCliente.codTipoCliente" value="J" />
								<div class="form-actions col-lg-offset-3 col-lg-9">
									<button class="btn btn-primary" type="submit">Guardar</button>
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