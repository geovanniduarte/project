/**
 * 
 */
var proyectoController  = angular.module('ProyectoApp.controller',[]);
	proyectoController.controller('ProyectoListController', function($scope, $state, $window, $log) {
	$scope.whatClassIsIt= function(column) {
    	var log = [];
    	
    	angular.forEach($scope.columnDefs, function(fila, index) {
    		if(fila.field==column)
    			this.push(fila);
   		}, log);
    	
    	if(log[0]!=undefined)
    		return log[0].displayName;
    	else
    		return "";    
    }     

	$scope.$on('gridEvento', function(event, pageSize, currentPage, order, searchQuery) {   
		$scope.pageSize=pageSize;
		$scope.currentPage=currentPage;
		$scope.order=order;
		$scope.searchQuery=searchQuery;
		if($scope.searchQuery==undefined)
			$scope.searchQuery=[];
		
   	if($scope.directiveGrid)
   		$scope.loadMyGrid();
   });
	
   $scope.loadMyGrid= function() {		
		Service.getData($scope.pageSize, $scope.currentPage, $scope.order, $scope.searchQuery.concat($scope.basicSearchQuery)).then(function(dataResponse) {
   		if(dataResponse.data.error!=undefined)
   			$scope.sendAlert(dataResponse.data.tituloError+': '+dataResponse.data.error);
       	else 
       		$scope.$broadcast('loadDataGrid',dataResponse.data.data, dataResponse.data.count, $scope.pageSize, $scope.currentPage);
       });
	}
});