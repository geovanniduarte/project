<table class="table">
  <tr>
    <th>Column 1 Heading</th>
    <th>Column 2 Heading</th>
  </tr>
  <tr>
    <td>Id</td>
    <td>{{cliente.clieid}}</td>
  </tr>
  <tr>
    <td>Nombre</td>
    <td>{{cliente.clienomb}}</td>
  </tr>
</table>

<div>
  <a class="btn btn-primary" ui-sref="clientes.editCliente({clieid:cliente.clieid})">Edit</a>
</div>