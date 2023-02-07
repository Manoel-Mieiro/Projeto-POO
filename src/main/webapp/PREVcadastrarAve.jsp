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
			<li><img src="img/bacana.png" height="20px"></li>
			<li><a href="cadastrarAve.jsp">Catalogar</a></li>
			<li><a href="consultarAve.jsp">Consultar</a></li>
			<li><a href="AAA.jsp">Aluno</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="catalogar" method="post" class="bananaForm">
			<div>
				<label><strong>Espécie:</strong></label><input type="text"
					name="especie">
			</div>
			<div>
				<label><strong>Família:</strong></label><input type="text"
					name="familia">
			</div>
			<div>
				<label><strong>Subfamília:</strong></label><input type="text"
					name="subfamilia">
			</div>
			<div>
				<label><strong>Nome em Inglês:</strong></label><input type="text"
					name="nomeIngles">
			</div>
			<label><strong>Estado de Conservação:</strong></label>
			<select name="estado">
  			<option value="extinto">EX</option>
  			<option value="extintoNatureza" selected>EW</option>
  			<option value="perigoCritico">CR</option>
  			<option value="perigo">EN</option>
  			<option value="vulneravel" selected>VU</option>
  			<option value="quaseAmeacada">NT</option>
  			<option value="poucoPreocupante">LC</option>
			</select>
			<br>	
			</div>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Catalogar">
			</div>
			<div>
				<%
				String onsucess = (String) request.getAttribute("onsucess");
				if (onsucess!=null) 
					out.print(onsucess);
				%>
			</div>
		</form>
	</main>
</body>
</html>	