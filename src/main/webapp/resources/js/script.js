/**
 * 
 */
var app=angular.module("app", []);
 
app.controller('LoginController', function ($scope) {
	  $scope.usuario = {username:'username', password:'password', mensaje:'este es el index'};
	  $scope.mensaje = 'mensaje 2';
	  $scope.cambiarMensaje = function() {
		  $scope.username = mensaje;		
	  }
	});




