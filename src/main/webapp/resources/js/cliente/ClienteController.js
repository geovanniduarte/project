/**
 * 
 */
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
 