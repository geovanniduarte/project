/**
 * 
 */
var app=angular.module("app", []);
alert('hola');
app.controller('LoginController', function($scope) {
	  alert($scope.mensaje);
	  $scope.usuario = {username:'username', password:'password'};
	  $scope.mensaje = 'mensaje 2';
	  $scope.cambiarMensaje = function() {
		  $scope.username = mensaje;		
	  }
	});




