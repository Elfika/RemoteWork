<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../Header.jsp" flush="true" />
<jsp:include page="../MenuAdmin.jsp" flush="true" />
	<div class="contenedor-gral text-center ">
	<div class="row ">
			<div class="col-lg-6 ">
		<div class="section-title">
			<h1>Alta de Recursos</h1>
			<div class="divider"></div>
			<p class="text-info">Ingrese los datos y luego presione el botón Dar de Alta</p>
		</div> 
        <form:form modelAttribute="proyecto" action="resultadoAltaProyecto" method="POST" class="form-alta">
            <div class="row">
            	<div class="col-lg-3">
			    	<div class="input-group">
			            <form:label path="nombreProyecto">Nombre del Proyecto</form:label>
			            <form:input path="nombreProyecto" class="form-control" required="true"/>
			        </div>
			    </div>
			    <div class="col-lg-3">
			    	<div class="input-group"> 		 
			            <form:label path="tipoProyecto">País</form:label>
				        <div>  
	            			<form:select path="tipo" class="form-control">
				                <form:options items="${tipos}" ></form:options>
				            </form:select>
				        </div>
			     	</div>
			    </div>
			    <div class="col-lg-3">
			    	<div class="input-group">           
			            <form:label path="descripcionProyecto">Descripción</form:label>
			            <form:textarea path="descripcionProyecto" class="form-control" required="true"/>
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
        <div class="col-lg-6">
       
				<jsp:include page="resultadoAltaUsuario.jsp" flush="false" /> 
			</div>
		</div>	   
	</div>
	<jsp:include page="../Footer.jsp" flush="true" />
 