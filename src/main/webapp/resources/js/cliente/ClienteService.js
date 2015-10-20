/**
 * 
 */
var clienteService = angular.module('ClienteaApp.service',[]);
clienteService.factory('cliente', function() {
	return $resource('http://localhost:8080/pyr/ws/clientes/:clieid', {clieid: '@clieid'}, {
		update: {
			method: 'PUT'
		}
	});
});