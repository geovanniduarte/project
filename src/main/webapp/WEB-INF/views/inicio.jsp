<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- define angular app -->
<html data-ng-app="app">

<head>

</head>
<!-- define angular controller -->
<body>
 <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" ui-sref="movies">The Movie App</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a ui-sref="movies">Home</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <div class="row top-buffer">
        <div class="col-xs-8 col-xs-offset-2">
          <div ui-view></div> <!-- This is where our views will load -->
        </div>
      </div>
    </div>
    <script type="text/javascript" src="lib/angular.min.js"></script>
    <script type="text/javascript" src="js/cliente/ClienteApp.js"></script>
    <script type="text/javascript" src="js/cliente/ClienteController.js"></script>
    <script type="text/javascript" src="js/cliente/ClienteService.js"></script>
    <script type="text/javascript" src="js/lib/angular-ui-router.min.js"></script>
    <script type="text/javascript" src="js/lib/angular-resource.min.js"></script>  
</body>

</html>