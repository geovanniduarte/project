<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- define angular app -->
<html data-ng-app="app">

<head>
	<title>The Cliente Module</title>
	
    
    <!-- link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/app.css"/-->
</head>
<!-- define angular controller -->
<body>
 <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" ui-sref="clientes">The Movie App</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a ui-sref="clientes.viewCliente">Home</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <div class="row top-buffer">
        <div class="col-xs-8 col-xs-offset-2">
          <div ui-view>
          </div> <!-- This is where our views will load -->
        </div>
      </div>
    </div>  
    
</body>
</html>