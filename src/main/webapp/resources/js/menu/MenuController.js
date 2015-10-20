/**
 * 
 */
// configure our routes
/*
app.config(function($stateProvider, $routeProvider) {

	$routeProvider

		// route for the home page
		.when('/', {
			templateUrl : 'modulos/cliente.html',
			controller  : 'clienteModuleController'
		})

		// route for the about page
		.when('/about', {
			templateUrl : 'modulos/modulo2.html',
			controller  : 'aboutRouteController'
		})

		// route for the contact page
		.when('/contact', {
			templateUrl : 'modulos/modulo3.html',
			controller  : 'contactRouteController'
		});
		
});

// create the controller and inject Angular's $scope
app.controller('clienteModuleController', ['$scope', '$log',  function($scope, $log) {
	// create a message to display in our view	
	$scope.message = 'Nuevo saludo'; 
	$scope.cliente = {
		  	clienit:"",
		    clienom:"",
		    cliedire:"",
		    clieciud:undefined,
		    clieacti:"",
		    cliefecr: new Date()
			}

 $log.debug("Acabamos de crear el $scope");	
	
}]);

app.controller('aboutRouteController', function($scope) {
	$scope.message = 'Look! I am an about page.';
});

app.controller('contactRouteController', function($scope) {
	$scope.message = 'Contact us! JK. This is just a demo.';
});
*/