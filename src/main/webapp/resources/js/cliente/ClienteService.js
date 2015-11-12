/**
 * 
 */
var clienteService = angular.module('ClienteaApp.service',[]);
clienteService.factory('Cliente', function($resource) {
	return $resource('http://localhost:8080/pyr/ws/clientes/clientes/:clieid', {clieid: '@_clieid'}, {
		update: {
			method: 'PUT'
		}
	});
});