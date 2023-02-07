package dex.model;

import java.sql.Date;

public class Registro {
private Integer codigoRegistro;
private  String midia;
private  Date dataSubmit;
private  String localImagem;
private Ave filme;
private Aluno aluno;

public Registro () {
	
}

public Registro(String midia, Date dataSubmit, String localImagem, Ave filme, Aluno aluno) {
	super();
	this.midia = midia;
	this.dataSubmit = dataSubmit;
	this.localImagem = localImagem;
	this.filme = filme;
	this.aluno = aluno;
}

public Registro(Integer codigoRegistro, String midia, Date dataSubmit, String localImagem, Ave filme, Aluno aluno) {
	super();
	this.codigoRegistro = codigoRegistro;
	this.midia = midia;
	this.dataSubmit = dataSubmit;
	this.localImagem = localImagem;
	this.filme = filme;
	this.aluno = aluno;
}

public Integer getCodigoRegistro() {
	return codigoRegistro;
}

public void setCodigoRegistro(Integer codigoRegistro) {
	this.codigoRegistro = codigoRegistro;
}

public String getMidia() {
	return midia;
}

public void setMidia(String midia) {
	this.midia = midia;
}

public Date getDataSubmit() {
	return dataSubmit;
}

public void setDataSubmit(Date dataSubmit) {
	this.dataSubmit = dataSubmit;
}

public String getLocalImagem() {
	return localImagem;
}

public void setLocalImagem(String localImagem) {
	this.localImagem = localImagem;
}

public Ave getFilme() {
	return filme;
}

public void setFilme(Ave filme) {
	this.filme = filme;
}

public Aluno getAluno() {
	return aluno;
}

public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}



}
