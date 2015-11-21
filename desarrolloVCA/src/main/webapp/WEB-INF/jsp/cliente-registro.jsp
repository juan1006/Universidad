<!DOCTYPE html>
<html>
<head>
<title>se7en - Dashboard</title>
<link href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700" media="all" rel="stylesheet"/>
<link href="stylesheets/application.css" media="all" rel="stylesheet"/>
<link href="stylesheets/isotope.css" media="all" rel="stylesheet"/>
<link href="stylesheets/normalize.css" media="all" rel="stylesheet"/>
<link href="stylesheets/fullcalendar.css" media="all" rel="stylesheet"/>
<link href="stylesheets/datatables.css" media="all" rel="stylesheet"/>
<link href="stylesheets/prettify.css" media="all" rel="stylesheet"/>
<link href="stylesheets/classyscroll.css" media="all" rel="stylesheet"/>
<link href="stylesheets/jquery.fancybox.css" media="all" rel="stylesheet"/>
<link href="stylesheets/select2.css" media="all" rel="stylesheet"/>
<link href="stylesheets/bootstrap.min.css" media="all" rel="stylesheet"/>
<link href="stylesheets/fontawesome.css" media="all" rel="stylesheet"/>
<link href="stylesheets/style.css" media="all" rel="stylesheet"/>
<link href="stylesheets/color/green.css" media="all" rel="alternate stylesheet" title="green-theme"/>
<link href="stylesheets/color/orange.css" media="all" rel="alternate stylesheet" title="orange-theme"/>
<link href="stylesheets/color/magenta.css" media="all" rel="alternate stylesheet" title="magenta-theme"/>
<link href="stylesheets/color/gray.css" media="all" rel="alternate stylesheet" title="gray-theme"/>
<link href="stylesheets/main.css" media="all" rel="stylesheet" />
<script src="javascripts/modernizr.custom.js"></script>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script src="javascripts/bootstrap.min.js"></script>
<script src="javascripts/jquery.mousewheel.js"></script>
<script src="javascripts/jquery.classyscroll.js"></script>
<script src="javascripts/jquery.vmap.min.js"></script>
<script src="javascripts/jquery.vmap.sampledata.js"></script>
<script src="javascripts/jquery.vmap.world.js"></script>
<script src="javascripts/fullcalendar.min.js"></script>
<script src="javascripts/gcal.js"></script>
<script src="javascripts/prettify.js"></script>
<script src="javascripts/jquery.dataTables.min.js"></script>
<script src="javascripts/jquery.fancybox.pack.js"></script>
<script src="javascripts/jquery.sparkline.min.js"></script>
<script src="javascripts/jquery.easy-pie-chart.js"></script>
<script src="javascripts/excanvas.min.js"></script>
<script src="javascripts/jquery.isotope.min.js"></script>
<script src="javascripts/select2.js"></script>
<script src="javascripts/styleswitcher.js"></script>
<script src="javascripts/main.js"></script>
<meta content="width=device-width, initial-scale=1.0" charset="utf-8" name="viewport"/>
</head>
<body>
<div class="navbar navbar-fixed-top">
  <div class="container-fluid top-bar">
    <div class="pull-right">
      <ul class="nav navbar-nav pull-right">
        <li class="dropdown notifications hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="widgets.html#"><span>Notifications</span>
          <p class="counter"> 4 </p>
          </a>
          <ul class="dropdown-menu">
            <li><a href="#">
              <div class="notifications label label-info"> New </div>
              New user added: Jane Smith </a></li>
            <li><a href="#">
              <div class="notifications label label-info"> New </div>
              Sales targets available </a></li>
            <li><a href="#">
              <div class="notifications label label-info"> New </div>
              New performance metric added </a></li>
            <li><a href="#">
              <div class="notifications label label-info"> New </div>
              New growth data available </a></li>
          </ul>
        </li>
        <li class="dropdown messages hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span>Messages</span>
          <p class="counter">3</p>
          </a>
          <ul class="dropdown-menu messages">
            <li><a href="#"><img alt="Avatar male2" height="34" src="images/avatar-male2.png" width="34"/> Could we meet today? I wanted... </a></li>
            <li><a href="#"><img alt="Avatar female" height="34" src="images/avatar-female.png" width="34"/> Important data needs your analysis... </a></li>
            <li><a href="#"><img alt="Avatar male2" height="34" src="images/avatar-male2.png" width="34"/> Buy Se7en today, it's a great theme... </a></li>
          </ul>
        </li>
        <li class="dropdown settings hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="widgets.html#"><span>Settings</span></a>
          <ul class="dropdown-menu">
            <li><a class="settings-link blue" href="javascript:chooseStyle('none', 30)"><span></span> Blue </a></li>
            <li><a class="settings-link green" href="javascript:chooseStyle('green-theme', 30)"><span></span> Green </a></li>
            <li><a class="settings-link orange" href="javascript:chooseStyle('orange-theme', 30)"><span></span> Orange </a></li>
            <li><a class="settings-link magenta" href="javascript:chooseStyle('magenta-theme', 30)"><span></span> Magenta </a></li>
            <li><a class="settings-link gray" href="javascript:chooseStyle('gray-theme', 30)"><span></span> Gray </a></li>
          </ul>
        </li>
        <li class="dropdown user hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown" href="widgets.html#"><img alt="Avatar male" height="34" src="images/avatar-male.jpg" width="34"/> John Smith <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="widgets.html#"><i class="icon-user"></i> My Account </a></li>
            <li><a href="widgets.html#"><i class="icon-gear"></i> Account Settings </a></li>
            <li><a href="index.html"><i class="icon-signout"></i> Logout </a></li>
          </ul>
        </li>
      </ul>
    </div>
    <button class="navbar-toggle"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
    <a class="logo" href="index.html">se7en</a>

  </div>
  <div class="container-fluid main-nav clearfix">
    <div class="nav-collapse">
      <ul class="nav">
        <li class="dashboard" ><a href="index.html"><span></span>Inicio </a></li>
        <li class="dropdown ui"><a data-toggle="dropdown"  class="current"  href="#"><span></span> Cliente <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="cliente-registro.html"  class="current" >Nuevo</a></li>
            <li><a href="cliente.html">Listar</a></li>
          </ul>
        </li>
        <li class="forms ui"><a data-toggle="dropdown" href="#"><span></span> Proveedor <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="proveedor-registro.html">Nuevo</a></li>
            <li><a href="proveedor.html">Listar</a></li>
          </ul>
        </li>
        <li class="forms"><a href="forms.html"><span></span> Inventario </a></li>
        <li class="tables"><a href="tables.html"><span></span> Reportes </a></li>
        <li class="settings"><a href="charts.html"><span></span> Configuracion </a></li>
      </ul>
    </div>
  </div>
</div>
<div class="container-fluid">
  <div class="page-title">
    <h1>Nuevo cliente </h1>
  </div>
  <div class="row">
    <div class="col-lg-12">
      <div class="widget-container fluid-height clearfix">
        <div class="widget-content padded">
          <div class="col-lg-12">
            <form action="http://sharpandnimble.com/se7en/forms#" class="form-horizontal">
              <div class="form-group">
                <label class="control-label col-lg-3">Nombre</label>
                <div class="col-lg-9">
                  <input class="form-control" placeholder="" type="text"/>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Apellido paterno</label>
                <div class="col-lg-9">
                  <input class="form-control" placeholder="" type="text"/>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Apellido materno</label>
                <div class="col-lg-9">
                  <input class="form-control" placeholder="" type="text"/>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Documento de identidad</label>
                <div class="col-lg-9">
                  <select class="form-control">
                    <option value="Category 1">DNI</option>
                    <option value="Category 2">Carnet de extranjería</option>
                  </select>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-lg-3">Número de documento de identidad</label>
                <div class="col-lg-9">
                  <input class="form-control" placeholder="Text" type="text"/>
                </div>
              </div>
              <div class="form-actions col-lg-offset-3 col-lg-9">
                <button class="btn btn-primary" type="submit">Submit</button>
                <button class="btn btn-default-outline">Cancel</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>