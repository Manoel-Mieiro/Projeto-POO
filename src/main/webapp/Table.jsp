<%@page import="dex.model.Ave"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Stiru.css">

<meta charset="ISO-8859-1">
<meta name = "viewport" content= "width=device-width, intial-scale=1.0">
<title>Dex</title>
</head>
<body>
	<nav class="top">
		<!-- <ul> -->
		<!-- <li><span style="color: lemonade">BirDex</span></li> -->
		<!-- <li> -->
		<img src="img/3285043.png" height="20px">
		<!-- </li> -->
		<!-- <li> -->
		<a href="cadastrarAve.jsp">Catalogar</a>
		<!-- </li> -->
		<!-- <li> -->
		<a href="consultarAve.jsp">Consultar</a>
		<!-- </li> -->
		<!-- <li> -->
		<a href="Login.jsp">Aluno</a>
		<!-- </li> -->
		<!-- </ul> -->
	</nav>
	<main class="main">
		<div class="register">
			<h2>Buscar</h2>
			<form action="buscarAveController" method="post" id="register">
				<div>
					<br> <label>Nome em Ingl�s:</label> <input type="text"
						name="nomeIngles" id="name">
				</div>
				<br>
				<br>
				<br>
				<div>
					<input id="submit" type="submit" name="salvar" value="Pesquisar">
					<!--era search no value  -->
				</div>
				<div>
					<%
					String onsucess = (String) request.getAttribute("onsucess");
					if (onsucess != null)
						out.print(onsucess);
					%>
				</div>
			</form>
			<%
			if (request.getAttribute("aves") != null) {
				List<?> aves = (List<?>) request.getAttribute("aves");
				for (int contador = 0; contador <= (aves.size() - 1); contador++) {
					Ave ave = (Ave) aves.get(contador);
			%>
			<form action="modificarRegistro" method="post">
				<table class="content-table">
					<thead>
						<tr>
							<th>C�digo</th>
							<th>Esp�cie</th>
							<th>Fam�lia</th>
							<th>Subfam�lia</th>
							<th>Nome em Ingl�s</th>
							<th>A��o</th>
						</tr>
					</thead>
					<tbody>
					<tr>
					<td><%out.print(ave.getCodigoAve());%></td>
					<td><%out.print(ave.getEspecie());%></td>
					<td><%out.print(ave.getFamilia());%></td>
					<td><%out.print(ave.getSubfamilia());%></td>
					<td><%out.print(ave.getNomeingles());%></td>
					<td>
					<div class = "op">
					<td><input id="op" type="submit" name="alterar"
							value="Alterar">
							<input id="op" type="submit" name="apagar" value="Excluir"></td>
							</div>
					</tr>
					</tbody>
				</table>
			</form>
			<%
			}
			}
			%>
		</div>
	</main>
</body>
</html>

<%-- <form action= "modificarRegistro" method= "post">
						 
 <input type = "hidden" name="id" value="<%out.print(ave.getCodigoAve());%>">
					<table class ="content-table">	
						<thead>
						<tr>
						<th scope="col">C�digo   <th>
									
						<th scope="col">Esp�cie   </th>
					
						<th scope="col">Fam�lia   </th>
					
						<th scope="col">Subfam�lia   </th>
					
						<th scope="col">Nome em Ingl�s   </th>
						
						<th scope="col">Estado de Conserva��o   </th>
						
						<th scope="col">A��o</th>
						</tr>
					</thead>
					<tbody>
					<tr>
					<th scope="row"><%out.print(ave.getCodigoAve());%></th>
					<td data-title="especie"><%out.print(ave.getEspecie());%></td>
					<td data-title="familia"><%out.print(ave.getFamilia());%></td>
					<td data-title="subfamilia"><%out.print(ave.getSubfamilia());%></td>
					<td data-title="nomeIngles"><%out.print(ave.getNomeingles());%></td>
					<td data-title="estadoConservacao"><%out.print(ave.getEstadoConservacao());%></td>
					<td><input id="op" type="submit" name="alterar"
							value="Alterar">
							<input id="op" type="submit" name="apagar" value="Excluir"></td>
					</tr>
					</tbody>
					</table>
			</form>
			<%
			}
			}
			%>
		</div>
		</main> 
</body>
</html> --%>