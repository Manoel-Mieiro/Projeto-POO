<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dex</title>
<link rel="stylesheet" href="css/Stiru.css" type="text/css">
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
	<div class="main">
		<div class="register">
			<h2>Registro</h2>
			<form action="catalogar" id="register" method="post">
			<label>Esp�cie: </label>
			<br>
			<input type="text" name="especie" id="name" placeholder="Entre com o nome da esp�cie">
			<br><br>
			<label>Fam�lia: </label>
			<br>
			<input type="text" name="familia" id="name" placeholder="Entre com o nome da fam�lia">
			<br><br>
			<label>Subfam�lia: </label>
			<br>
			<input type="text" name="subfamilia" id="name" placeholder="Entre com o nome da subfam�lia">
			<br><br>
			<label>Nome em Ingl�s: </label>
			<br>
			<input type="text" name="nomeIngles" id="name" placeholder="Entre com o nome em Ingl�s">
			<br><br>
			
			<label>Estado de Conserva��o: </label>
			<div class="custom-select">
			<select name="estado">
  			<option value="extinto">EX</option>
  			<option value="extintoNatureza" selected>EW</option>
  			<option value="perigoCritico">CR</option>
  			<option value="perigo">EN</option>
  			<option value="vulneravel" selected>VU</option>
  			<option value="quaseAmeacada">NT</option>
  			<option value="poucoPreocupante">LC</option>
			</select>
			</div>
			<br><br><br>
			<input type="submit" value="Catalogar" name="submit" id="submit">
			</form>
		</div>
		<div>
				<%
				String onsucess = (String) request.getAttribute("onsucess");
				if (onsucess!=null) 
					out.print(onsucess);
				%>
		</div>
		<!--end register-->
	</div>
	<!--end main-->
</body>
</html>
    