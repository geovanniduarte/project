/**
 * 
 */
// configure our routes
app.config(function($routeProvider) {
	$routeProvider

		// route for the home page
		.when('/', {
			templateUrl : 'modulos/cliente.html',
			controller  : 'clienteRouteController'
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
app.controller('clienteRouteController', ['$scope', '$log', 'remoteResource', function($scope, $log, remoteResource) {
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
 $scope.enviarCliente = function() {
	 alert('enviar cliente');
	 remoteResource.request(function(data) {
		 $scope.message = data;
	 },function(data, status) {
		 $scope.message = data;
	 });
 }
 $log.debug("Acabamos de crear el $scope");	
	
}]);

app.controller('aboutRouteController', function($scope) {
	$scope.message = 'Look! I am an about page.';
});

app.controller('contactRouteController', function($scope) {
	$scope.message = 'Contact us! JK. This is just a demo.';
});