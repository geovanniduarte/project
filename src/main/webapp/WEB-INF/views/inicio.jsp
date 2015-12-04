<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- define angular app -->
<html data-ng-app="app">

<head>
  <!-- SCROLLS -->
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" />
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" />
  <link rel="stylesheet" href="http://ui-grid.info/release/ui-grid.css" type="text/css">
  <!-- SPELLS --> 
    
  <script type="text/javascript" src="resources/js/lib/angular.min.js"></script>
  <script src="http://ui-grid.info/release/ui-grid.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-touch.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular-animate.js"></script>
   
  <script type="text/javascript" src="resources/js/menu/MenuApp.js"></script>  
  <script type="text/javascript" src="resources/js/clientes/ClienteApp.js"></script>
  <script type="text/javascript" src="resources/js/clientes/ClienteController.js"></script>
  <script type="text/javascript" src="resources/js/clientes/ClienteService.js"></script>  
  <script type="text/javascript" src="resources/js/usuarios/UsuarioController.js"></script>
  <script type="text/javascript" src="resources/js/usuarios/UsuarioService.js"></script>  
  <script type="text/javascript" src="resources/js/proyectos/ProyectoController.js"></script>  
  <script type="text/javascript" src="resources/js/lib/angular-ui-router.min.js"></script>
  <script type="text/javascript" src="resources/js/lib/angular-resource.min.js"></script>
  <script type="text/javascript" src="resources/js/common/FrmDirectiveGrid.js"></script>  
</head>

<!-- define angular controller -->
<body>
  <nav class="navbar navbar-default">
    <div class="container">
      <div class="navbar-header">
        <a class="navbar-brand" href="/">Angular Routing Example</a>
      </div>

      <ul class="nav navbar-nav navbar-right">
        <li><a ui-sref="clientes"><i class="fa fa-home"></i>Clientes</a></li>
        <li><a ui-sref="proyectos"><i class="fa fa-shield"></i>Proyectos</a></li>
        <li><a ui-sref="usuarios"><i class="fa fa-comment"></i> Usuarios</a></li>
      </ul>
    </div>
  </nav>
  <P>  The time on the server is ${serverTime}. </P>
  <p><a href="<c:url value="/j_spring_security_logout" />">Logout</a></p>
  <div id="main">
  
    <!-- angular templating -->
		<!-- this is where content will be injected -->
  <div ui-view></div>
    
  </div>
  
  <footer class="text-center">
    <p>View the tutorial on <a href="http://scotch.io/tutorials/javascript/single-page-apps-with-angularjs-routing-and-templating">Scotch.io</a></p>
  
    <p>View a tutorial on <a href="http://scotch.io/tutorials/javascript/animating-angularjs-apps-ngview">Animating Your Angular Single Page App</a></p>
  </footer>
  
</body>

</html>