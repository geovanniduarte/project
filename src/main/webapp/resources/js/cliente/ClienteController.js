/**
 * 
 */

var clienteController = angular.module('ClienteApp.controller', []);

clienteController.controller('ClienteListController', function($scope, $state, $window, $log, /*factory*/ Cliente) {
	
	$scope.clientes = Cliente.query();
	$log.log($scope.clientes);
	$scope.deleteCliente = function(cliente) {	
			cliente.$delete(function() {
				$window.location.href = '';
			});		
	}
});

clienteController.controller('ClienteViewController', function($scope, $stateParams, /*factory*/ Cliente) {	
	$scope.cliente = Cliente.get({clieid: $stateParams.clieid});
});

clienteController.controller('ClienteCreateController' , function($scope, $state, $stateParams, /*factory*/ Cliente) {
	$scope.cliente = new Cliente();
	$scope.addCliente = function() {
		Cliente.$save(function() {
			$state.go('clientes')
		});
	}
});

clienteController.controller('ClienteUpdateController', function($scope, $state, $stateParams, /*factory*/ Cliente) {
	$scope.updateCliente = function() {
		alert('update clientes update' +  Cliente);
		$scope.cliente.update(function() {
			$state.go('clientes');
		});
	}
	
	$scope.loadCliente = function() { 
		$scope.cliente = Cliente.get({clieid: $stateParams.clieid});
	};
	
	$scope.loadCliente();
});