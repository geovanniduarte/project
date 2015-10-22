<a ui-sref="newMovie" class="btn-primary btn-lg nodecoration">Add New Customer</a>
<table>
	<tr>
		 <h3>
		 	Clients
		 </h3>
	</tr>
	<tr >
		<td>{{cliente.nombre}}</td>
		<td>
	      <a class="btn btn-primary" ui-sref="viewCliente({clieid:cliente.clieid})">View</a>
	      <a class="btn btn-danger"  ng-click="deleteCliente(cliente)">Delete</a>
	    </td>
	</tr>	
</table>