/**
 * 
 */
app.controller('clienteController', function ($scope) {
	 $scope.cliente = {
			  	nit:"",
			    nombre:"",
			    direccion:"",
			    cuidad:undefined,
			    actividad:"",
			    fechaCreacion: new Date()
				}
});
 