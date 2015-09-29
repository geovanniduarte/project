/**
 * 
 */
// configure our routes
app.config(function($routeProvider) {
	$routeProvider

		// route for the home page
		.when('/', {
			templateUrl : 'modulos/modulo1.html',
			controller  : 'mainController'
		})

		// route for the about page
		.when('/about', {
			templateUrl : 'modulos/modulo2.html',
			controller  : 'aboutController'
		})

		// route for the contact page
		.when('/contact', {
			templateUrl : 'modulos/modulo3.html',
			controller  : 'contactController'
		});
});

// create the controller and inject Angular's $scope
app.controller('mainController', function($scope) {
	// create a message to display in our view
	$scope.message = 'Everyone come and see how good I look!';
});

app.controller('aboutController', function($scope) {
	$scope.message = 'Look! I am an about page.';
});

app.controller('contactController', function($scope) {
	$scope.message = 'Contact us! JK. This is just a demo.';
});