<%@page import="dex.model.Ave"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Stiru.css">

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
			<!-- <li> --><a href="Login.jsp">Aluno</a><!-- </li> -->
		<!-- </ul> -->
	</nav>
	<main class="main">
		<div class="register">
	<h2>Buscar</h2>
		<form action="buscarAveController" method="post" id= "register">
			<div>
			<br>
				<label>Nome em Ingl�s:</label>
				<input type="text" name="nomeIngles" id="name">
			</div>
			<br><br><br>
			<div>
				<input id="submit" type="submit" name="salvar" value="Pesquisar"> <!--era search no value  -->
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
				<b>---------------------------------------------------------------------------------------------</b>
					<div class="bananaColumn">
						<span style="font-weight: bold">C�digo</span> <span> <%
 out.print(ave.getCodigoAve());
 %></span>
 <input type = "hidden" name="id" value="<%out.print(ave.getCodigoAve());%>">
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Esp�cie</span> <span>
							<%
							out.print(ave.getEspecie());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Fam�lia</span> <span>
							<%
							out.print(ave.getFamilia());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Subfam�lia</span> <span>
							<%
							out.print(ave.getSubfamilia());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Nome em Ingl�s</span> <span>
							<%
							out.print(ave.getNomeingles());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Estado de Conserva��o</span> <span>
							<%
							out.print(ave.getEstadoConservacao());
							%>
						</span>
					</div>
					<div class="bananaColumn">
						<input id="op" type="submit" name="alterar"
							value="Alterar"> <input id="op"
							type="submit" name="apagar" value="Excluir">
					</div>
				</div>
				<b>---------------------------------------------------------------------------------------------</b>
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