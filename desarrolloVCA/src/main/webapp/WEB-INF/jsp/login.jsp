<%@ include file="/common/tagLibs.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="<c:url value='/recursos/css/bootstrap.min.css'/>" >
<link rel="stylesheet" href="<c:url value='/recursos/css/main.css'/>">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
</head>
<body>
	<div class="box">
		<div class="row vertical-centered-text">
			<div class="col-lg-6 col-sm-6">
				<h3 class="mg-2">
					<i class="fa fa-star"></i> Programa VCA
				</h3>
			</div>
			<div class="col-lg-6 col-sm-6 text-right ">
				<strong>Ingresar</strong> / <a href="registrar.htm">Registrate</a>
			</div>
		</div>
		<div class="box-white">
			<form:form id="login" method="post" action="login.htm"
				commandName="empleado">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-user"></i>
							<!-- 							<i class="fa fa-envelope"></i> -->
						</div>
						<form:input class="form-control" id="usuario"
							placeholder="Usuario" name="nick" path="nick" maxlength="50" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-lock"></i>
						</div>
						<form:password class="form-control" id="contrasena"
							placeholder="Contraseña" name="contrasena" path="contrasena" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-6">
						<div class="checkbox">
							<label> <input type="checkbox"> Recordar
								contraseña
							</label>
						</div>
					</div>
				</div>
				<button type="submit" class="btn btn-default btn-md btn-block">Ingresar</button>
			</form:form>
		</div>
		<div class="row">
			<div class="col-lg-offset-6 col-lg-6 text-right">
				<a href="">¿Olvidaste tu contraseña?</a>
			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="<c:url value='/recursos/js/bootstrap.min.js'/>"></script>
</body>
</html>