/**
 * 
 */
var proyectoController  = angular.module('ProyectoApp.controller',['ngTouch','ui.grid']);
	proyectoController.controller('ProyectoListController', function($scope, $state, $window, $log) {
		$scope.gridOptions = {
				enableFiltering:true,
				columnDefs : []
		}
});