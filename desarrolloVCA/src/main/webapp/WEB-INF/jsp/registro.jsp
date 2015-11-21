<%@ include file="/common/tagLibs.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="<c:url value='/recursos/css/bootstrap.min.css'/>" rel="stylesheet">
<link rel="stylesheet" href="<c:url value='/recursos/css/main.css'/>">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
</head>
<body>
	<div class="box">
		<div class="row vertical-centered-text">
			<div class="col-lg-6 col-sm-6">
				<h3 class="mg-2">
					<i class="fa fa-star-o"></i> Programa VCA
				</h3>
			</div>
			<div class="col-lg-6 col-sm-6 text-right ">
				<a href="login.htm">Ingresar</a> / <strong>Registrate</strong>
			</div>
		</div>
		<div class="box-white">
			<form:form id="registro" method="post" action="registrar.htm"
				commandName="empleado">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-check-square-o"></i>
						</div>
						<form:input class="form-control" id="primNombre"
							placeholder="Nombre" name="primNombre" path="primerNombre" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-check-square-o"></i>
						</div>
						<form:input class="form-control" id="apellidoPat"
							placeholder="Apellido Paterno" name="apellidoPat" path="apellidoPat" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-check-square-o"></i>
						</div>
						<form:input class="form-control" id="apellidoMat"
							placeholder="Apellido Materno" name="apellidoMat" path="apellidoMat" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-envelope-o"></i>
						</div>
						<form:input class="form-control" id="correo" placeholder="Correo"
							name="correo" path="correo" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-user"></i>
						</div>
						<form:input class="form-control" id="nick" placeholder="Nick"
							name="nick" path="nick" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-lock"></i>
						</div>
						<form:input class="form-control" id="contrasena"
							placeholder="Contraseña" name="contrasena" path="contrasena" />
					</div>
				</div>
				<button type="submit" class="btn btn-default btn-md btn-block">Registrar</button>
			</form:form>
		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="<c:url value='/recursos/js/bootstrap.min.js'/>"></script>
</body>
</html>