/**
 * Service para usuario que registr los ds 
 */
var usuarioService = angular.module('UsuarioApp.Service', []);
usuarioService.factory('Usuario', function($resource) {
	return $resource('http://localhost:8080/pyr/ws/usuarios/usuarios/:usuaid',{usuaid:'@usuaid'}, {
		update: {
			method: 'PUT'
		}
	});
});