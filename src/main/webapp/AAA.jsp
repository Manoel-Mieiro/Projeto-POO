<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/style.css">
<title>Aluno</title>
</head>

<body>
	<div class="container">
		<div class="form-image">
			<img src="img//3285043.png" alt="">
		</div>
		<main class="form">
			<form action="entrarAluno" method="post" class="form">
				<div class="form-header">
					<div class="title">
						<h1>Bem Vindo(a)</h1>
					</div>
					</div>

				<div class="input-group">
					<div class="input-box">
						<label for="nomeCompleto">Nome</label> <input 
							type="text" name="nomeCompleto"
							placeholder="Digite seu nome completo" required>
					</div>

					<div class="input-box">
						<label for="matricula">Matrícula</label> <input
							type="text" name="matricula" placeholder="Informe a matricula"
							required>
					</div>
					<div class="input-box">
						<label for="emailResponsavel">E-mail</label> <input type="email"
							name="emailResponsavel"
							placeholder="Digite o e-mail do responsável" required>
					</div>

					<div class="input-box">
						<label for="endereco">Endereço</label> <input 
							type="text" name="endereco"
							placeholder="Rua + Bairro + Cidade + UF" required>
					</div>
					</div>
					<!-- <form> -->
						<div class="input-box">
							<label for="start">Data de Nascimento</label> <input type="date"
								id="start" name="dataNascimento" placeholder=MM/dd/YYYY required
								value="2022-12-31" min="2000-01-01" max="2022-12-31">
					</div>
					<!-- </form> -->
					<button>
					<div class="login-button" type="submit" name="entrar" value="Login">
<!-- 						<button>
							<a href="cadastrarAve.jsp">Entrar</a>
						</button> -->
						</button>
					</div>
					
	
			<%
				String onsucess = (String) request.getAttribute("onsucess");
				if (onsucess!=null) 
					out.print(onsucess);
				%>
<!-- 	</main> -->
	</form>
	</main>
</div>
</body>

</html>