/**
 * 
 */
var app=angular.module("app", []);

app.controller('LoginController', function($scope) {	 
	  $scope.usuario = {username:'mkyong', password:'123456'};
	  $scope.mensaje = 'mensaje 2';
	  $scope.cambiarMensaje = function() {
		  $scope.username = mensaje;		
	  }
	});




