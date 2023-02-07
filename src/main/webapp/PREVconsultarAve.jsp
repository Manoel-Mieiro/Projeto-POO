<%@page import="dex.model.Ave"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bananaStyle.css">

<meta charset="ISO-8859-1">
<title>BirDex</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><span style="color: lemonade">BirDex</span></li>
		<li><img src="img/3285043.png" height="20px"></li>
			<li><a href="cadastrarAve.jsp">Catalogar</a></li>
			<li><a href="consultarAve.jsp">Consultar</a></li>
			<li><a href="AAA.jsp">Aluno</a></li>
	</ul>
	</nav>
	<main class="bananaMain">
	<div class="bananaForm">
		<form action="buscarAveController" method="post">
			<div>
				<label><strong>Busca pelo nome em Inglês:</strong></label><input
					type="text" name="nomeIngles">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar" value="search">
			</div>
			<div>
				<%
				String onsucess = (String) request.getAttribute("onsucess");
				if (onsucess!=null) 
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
			<form action= "modificarRegistro" method= "post">
			<div class="bananaDivMother">
				<div class="bananaDivRegistro">
					<div class="bananaColumn">
						<span style="font-weight: bold">Código</span> <span> <%
 out.print(ave.getCodigoAve());
 %></span>
 <input type = "hidden" name="id" value="<%out.print(ave.getCodigoAve());%>">
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Espécie</span> <span>
							<%
							out.print(ave.getEspecie());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Família</span> <span>
							<%
							out.print(ave.getFamilia());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Subfamília</span> <span>
							<%
							out.print(ave.getSubfamilia());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Nome em Inglês</span> <span>
							<%
							out.print(ave.getNomeingles());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Estado de Conservação</span> <span>
							<%
							out.print(ave.getEstadoConservacao());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<input id="bananaItemButton" type="submit" name="alterar"
							value="Alterar"> <input id="bananaItemButton"
							type="submit" name="apagar" value="Excluir">
					</div>
				</div>
			</div>
			</form>
			<%
			}
			}
			%>
		</div>
	</main> 
</body>
</html>