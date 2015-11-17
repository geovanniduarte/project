<a ui-sref="clientes.newCliente" class="btn-primary btn-lg nodecoration">Add New Customer</a>
<table>
	<tr>
		 <h3>
		 	Clients
		 </h3>
	</tr>
	<tr ng-repeat="cliente in clientes">
		<td>{{cliente.clienomb}}</td>
		<td>
	      <a class="btn btn-primary" ui-sref="clientes.viewCliente({clieid:cliente.clieid})">View</a>
	      <a class="btn btn-danger"  ng-click="deleteCliente(cliente)">Delete</a>
	    </td>
	</tr>	
</table>