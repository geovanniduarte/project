/**
 * 
 */
/*
app.controller('clienteController', ['$scope','$log','remoteResource',function ($scope, $log, remoteResource) {
	$scope.message = 'Everyone come and see how good I look!'; 
	$scope.cliente = {
			  	clienit:"",
			    clienom:"",
			    cliedire:"",
			    clieciud:undefined,
			    clieacti:"",
			    cliefecr: new Date()
				}
	 $scope.message;
	 $scope.enviarCliente = function() {
		 alert('enviar cliente');
		 remoteResource.request(function(data) {
			 $scope.message = data;
		 },function(data, status) {
			 $scope.message = data;
		 }, $scope.cliente);
	 }
	 $log.debug("Acabamos de crear el $scope");	
	 
}]);
*/
var clienteController = angular.module('ClienteApp.controller', []);

clienteController.controller('ClienteListController', ['$scope', '$state', '$window', 'Cliente', function($scope, $state, $window, /*factory*/ Cliente) {
	
	$scope.clientes = Cliente.query();
	alert('est: ' + $scope.clientes);
	$scope.deleteCliente = function(cliente) {	
			cliente.$delete(function() {
				$window.location.href = '';
			});		
	}
}]);

clienteController.controller('ClienteViewController', function($socope, $stateParams, /*factory*/ Cliente) {
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
		Cliente.$update(function(){
			$state.go('clientes');
		});
	}
	
	$scope.loadCliente = Cliente.get({clieid: $stateParams.clieid});
	
	$scope.loadCliente();
});