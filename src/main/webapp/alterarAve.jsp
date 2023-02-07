<%@page import="dex.model.Ave"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" href="css/bananaStyle.css"> -->
<link rel="stylesheet" href="css/Stiru.css" type="text/css">

<meta charset="ISO-8859-1">
<title>Dex</title>
</head>
<body>
	<nav class="top">
	<!-- <ul> -->
			<!-- <li><span style="color: lemonade">BirDex</span></li> -->
			<!-- <li> --><img src="img/3285043.png" height="20px"><!-- </li> -->
			<!-- <li> --><a href="cadastrarAve.jsp">Catalogar</a><!-- </li> -->
			<!-- <li> --><a href="consultarAve.jsp">Consultar</a><!-- </li> -->
			<!-- <li> --><a href="AAA.jsp">Login</a><!-- </li> -->
		<!-- </ul> -->
	</nav>
	<main class="main">
	<div class="register">
		<h2>Registro</h2>
		<form action="modificarRegistro" method="post" class="bananaForm" id="register">
		<%
		Ave ave = null;
		if (request.getAttribute("ave") != null){
			 ave = (Ave) request.getAttribute("ave");
		}
		%>
			<div>
				<label><strong>Espécie:</strong></label><br><input type="text"
				
					name="especie" id="name" value = "<%out.print(ave.getEspecie());%>">
					<br><br>
			</div>
			<div>
				<label><strong>Família:</strong></label><br><input type="text"
					name="familia" id="name" value = "<%out.print(ave.getFamilia());%>">
					<br><br>
			</div>
			<div>
				<label><strong>Subfamília:</strong></label><br><input type="text"
					name="subfamilia" id="name" value = "<%out.print(ave.getSubfamilia());%>">
					<br><br>
			</div>
			<div>
				<label><strong>Nome em Inglês:</strong></label><br><input type="text"
					name="nomeIngles" id="name" value = "<%out.print(ave.getNomeingles());%>">
					<br><br> 
			</div>
			<label><strong>Estado de Conservação:</strong></label>
			<select name="estado" value = "<%out.print(ave.getEstadoConservacao());%>">
  			<option value="extinto">EX</option>
  			<option value="extintoNatureza" selected>EW</option>
  			<option value="perigoCritico">CR</option>
  			<option value="perigo">EN</option>
  			<option value="vulneravel" selected>VU</option>
  			<option value="quaseAmeacada">NT</option>
  			<option value="poucoPreocupante">LC</option>
			</select>
			<br><br><br>
			<div>
				<input id="submit" type="submit" name="alterar" value="Alterar Ave">	
			</div>
			<div>
				<input type="hidden" name="id"> <!-- funcionava sem o hidden --> <%-- value="<%ave.getCodigoAve();%>" --%>
			</div>
			<div>
				<%
				String onsucess = (String) request.getAttribute("onsucess");
				if (onsucess!=null) 
					out.print(onsucess);
				%>
			</div>
		</form>
		</div>
	</main>
</body>
</html>	