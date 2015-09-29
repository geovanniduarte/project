/**
 * 
 */
app.controller('clienteController', function ($scope, $log) {
	 $scope.cliente = {
			  	nit:"",
			    nombre:"",
			    direccion:"",
			    cuidad:undefined,
			    actividad:"",
			    fechaCreacion: new Date()
				}
	 $log.debug("Acabamos de crear el $scope");
});
 