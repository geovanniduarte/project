/**
 * 
 */
var usuarioController = angular.module('UsuarioApp.controller', ['ngTouch', 'ui.grid', 'UsuarioApp.Service']);
usuarioController.controller('UsuarioListController', ['$scope', '$stateParams', 'Usuario', function($scope, $stateParams, /*factory*/ Usuario) {
	$scope.gridOptions = {
			enableFiltering:true,
			columnDefs:[{name: 'usuaid'},
			            {name: 'usuanomb'},
			            {name: 'usuapass'},
			            {name: 'usuahabi'},
			            {name: 'usuac2dm'}],
			onRegisterApi: function(gridApi) {
				$scope.gridApi = gridApi;
				$scope.gridApi.core.on.filterChanged($scope, function() {
					
				});
			}	
	}	
	$scope.gridOptions.data = Usuario.query();
	alert('usuario: ' + $scope.gridOptions.data);
	}]);