<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- define angular app -->
<html data-ng-app="app">

<head>
  <!-- SCROLLS -->
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" />
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" />

  <!-- SPELLS --> 
 
  
  <script type="text/javascript" src="resources/js/lib/angular.min.js"></script>
  <script type="text/javascript" src="resources/js/menu/MenuApp.js"></script>
  <script type="text/javascript" src="resources/js/menu/MenuController.js"></script>  
  <script type="text/javascript" src="resources/js/cliente/ClienteApp.js"></script>
  <script type="text/javascript" src="resources/js/cliente/ClienteController.js"></script>
  <script type="text/javascript" src="resources/js/cliente/ClienteService.js"></script>
  <script type="text/javascript" src="resources/js/lib/angular-ui-router.min.js"></script>
  <script type="text/javascript" src="resources/js/lib/angular-resource.min.js"></script>  
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
        <li><a href="#about"><i class="fa fa-shield"></i> About</a></li>
        <li><a href="#contact"><i class="fa fa-comment"></i> Contact</a></li>
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