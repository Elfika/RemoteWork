	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<div class="section-title">
		<h1>Alta de Recursos</h1>
		<div class="divider"></div>
		<p class="text-info">Ingrese los datos y luego presione el botón Dar de Alta</p>
	</div>
		<form  class="form-alta" onsubmit="return validarFormulario()">
			<div class="row">
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>Nombre</label>
			        <input id="nombreUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>Apellido</label>
			        <input id="apellidoUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>DNI</label>
			        <input id="dniUs" class="form-control" type="text">
			    </div>
			  </div>
			</div>
			<div class="row btn-bajo">
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>Dirección</label>
			        <input id="direccionUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>Número</label>
			        <input id="numDireUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>País</label>
			        <div>  
            			<select class="form-control">
            				<option>Seleccione</option>
              				<option>Argentina</option>
              				<option>Uruguay</option>
              				<option>Brasil</option>
        				</select>
        			</div>  
			    </div>
			  </div>
			</div>
			<div class="row btn-bajo">
			  <div class="col-lg-3">
			  	<div class="input-group">
			    	<label>Email</label>
			        <input id="emailUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>Teléfono</label>
			        <input id="telefonoUs" class="form-control" type="text">
			    </div>
			  </div>
			  <div class="col-lg-3">
			    <div class="input-group">
			       	<label>ID Skype</label>
			        <input id="telefono2Us" class="form-control" type="text">
			    </div>
			  </div>
			</div>
			<div class="row btn-bajo">
				<div class="col-lg-6">
					<button class="btn btn-large btn-primary btn-der" type="submit" onclick="validacion()">Dar de Alta</button>
				</div>	
			</div>	
		</form>


