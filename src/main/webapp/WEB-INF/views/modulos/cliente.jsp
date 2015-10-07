<div class="jumbotron text-center">
	<h1>Modulo 1</h1>	
	<p>{{ message }}</p>
	<p>{{ cliente.cliefecr }}</p>
	<form>
      <fieldset>
        <legend>Cliente</legend>
          <label for="nit">NIT:</label><input id="nit" name="nit" type="text" ng-model="cliente.clienit" /><br>
          <label for="nombre">Nombre:</label><input id="nombre" name="nombre" type="text" ng-model="cliente.clienomb" /><br>
          <label for="ape1">Direccion: </label><input id="ape1" name="ape1" type="text" ng-model="cliente.cliedire" /><br>
          <label for="edad">Ciudad:</label><input id="edad" name="edad" type="text" ng-model="cliente.clieciud" /><br>
          <label for="sexo">Actividad</label><select id="sexo" name="sexo" type="checkbox" ng-model="cliente.clieacti" ><option value="">--Elige opcion--</option><option value="1">Actividad 1</option><option value="2">Actividad 2</option></select><br>        
          <label for="fechaCreacion">Fecha de creaci&oacute;n:</label><input id="fechaCreacion" name="fechaCreacion" type="text" ng-model="cliente.cliefecr" /><br>
      	  <button ng-click="enviarCliente()" >Enviar</button>
      </fieldset>
      </form>
</div>

