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
			<!-- <li> --><a href="AAA.jsp">Aluno</a><!-- </li> -->
		<!-- </ul> -->
	</nav>
	<div class="main">
		<div class="register">
			<h2>Área do Aluno</h2>
			<form action="entrarAluno" id="register" method="post">
			<label>Nome: </label>
			<br>
			<input type="text" name="matricula" id="name" placeholder="Digite seu nome completo" required>
			<br><br>
			<label>Matrícula: </label>
			<br>
			<input type="text" name="nomeCompleto" id="name" placeholder="Informe a matricula" required>
			<br><br>
			<label>E-mail: </label>
			<br>
			<input type="text" name="emailResponsavel" id="name" placeholder="Digite o e-mail do responsável" required>
			<br><br>
			<label>Endereço: </label>
			<br>
			<input type="text" name="endereco" id="name" placeholder="Rua + Bairro + Cidade + UF" required>
			<br><br>
			
			<div class="input-box">
			<label for="start">Data de Nascimento</label> <input type="date"
								id="start" name="dataNascimento" placeholder=MM/dd/YYYY required
								value="2022-12-31" min="2000-01-01" max="2022-12-31">
								</div>
			<br><br><br>
			<input type="submit" value="Login" name="entrar" id="submit">
			</form>
		</div>
		<div>
				<%
				String msg = (String) request.getAttribute("msg");
				if (msg!=null) 
					out.print(msg);
				%>
		</div>
		<!--end register-->
	</div>
	<!--end main-->
</body>
</html>
    