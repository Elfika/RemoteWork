<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="Header.jsp" flush="true" />
<jsp:include page="Menu.jsp" flush="true" />
	<div class="contenedor-gral text-center ">
		<div class="section-title">
			<h1>Alta de Recursos</h1>
			<div class="divider"></div>
			<p class="text-info">Ingrese los datos y luego presione el botón Dar de Alta</p>
		</div> 
        <form:form modelAttribute="usuario" action="resultadoAltaUsuario" method="POST" class="form-alta">
            <div class="row">
            	<div class="col-lg-3">
			    	<div class="input-group">
			            <form:label path="nombre">Nombre</form:label>
			            <form:input path="nombre" class="form-control"/>
			        </div>
			    </div>
			    <div class="col-lg-3">
			    	<div class="input-group">        
			            <form:label path="apellido">Apellido</form:label>
			            <form:input path="apellido" class="form-control"/>
			        </div>
			    </div>
			    <div class="col-lg-3">
			    	<div class="input-group">           
			            <form:label path="dni">DNI</form:label>
			            <form:input path="dni" class="form-control"/>
			        </div>
			    </div>
			</div>
			<div class="row btn-bajo">
			    <div class="col-lg-3">
			        <div class="input-group">            
            		    <form:label path="direccion">Dirección</form:label>
           			    <form:input path="direccion" class="form-control" />
           		    </div>
           		</div>
           		<div class="col-lg-3">
				    <div class="input-group">
				       	<form:label path="numero">Número</form:label>
				        <form:input path="numero" class="form-control" />
				       <!-- <form:errors path="numero" cssClass="error" /> -->
				    </div>
			    </div>
           		 <div class="col-lg-3">
			        <div class="input-group"> 		 
			            <form:label path="country">País</form:label>
				        <div>  
	            			<form:select path="country">
				                <form:options items="${countries}"></form:options>
				            </form:select>
				        </div>
			     	</div>
			     </div>	
			</div>
			<div class="row btn-bajo"> 
			   <div class="col-lg-3"> 
			   		<div class="input-group"> 
	                	<form:label path="email">Email</form:label>
	                	<form:input path="email" class="form-control" />
	                </div>	
             	</div>
             	<div class="col-lg-3">
             		<div class="input-group"> 
	             		<form:label path="telefono">Teléfono</form:label>
	             		<form:input path="telefono" class="form-control" />
	             	</div>	
             	</div>
             	<div class="col-lg-3">
             		<div class="input-group"> 
             			<form:label path="idSkype">Skype</form:label>
	             		<form:input path="idSkype" class="form-control" />
             		</div>
             	</div>
           	</div>
			<div class="row btn-bajo"> 
			   <div class="col-lg-3"> 
                	<input type="submit" class="btn btn-large btn-primary" value="Dar de Alta">
             	</div>
           	</div>
        </form:form>     
	</div>
	<jsp:include page="Menu.jsp" flush="true" />
    </body>
</html>