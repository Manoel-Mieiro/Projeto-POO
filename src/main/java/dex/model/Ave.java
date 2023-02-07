package dex.model;

import java.util.ArrayList;

import dex.dao.AveDao;

public class Ave {


private Integer codigoAve;
private String especie;
private String familia;
private  String subfamilia;
private  String nomeingles;
private  String estadoConservacao;
//private  ArrayList <Registro> registros = new ArrayList<Registro>();

public Ave (){
	
}


public Ave(Integer codigoAve, String especie, String familia, String subfamilia, String nomeingles,
		String estadoConservacao) {
	super();
	this.codigoAve = codigoAve;
	this.especie = especie;
	this.familia = familia;
	this.subfamilia = subfamilia;
	this.nomeingles = nomeingles;
	this.estadoConservacao = estadoConservacao;
}


public Ave(String especie, String familia, String subfamilia, String nomeingles, String estadoConservacao) {
	super();
	this.especie = especie;
	this.familia = familia;
	this.subfamilia = subfamilia;
	this.nomeingles = nomeingles;
	this.estadoConservacao = estadoConservacao;
}


public int getCodigoAve() {
	return codigoAve;
}

public void setCodigoAve(Integer codigoAve) {
	this.codigoAve = codigoAve;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getFamilia() {
	return familia;
}

public void setFamilia(String familia) {
	this.familia = familia;
}

public String getSubfamilia() {
	return subfamilia;
}

public void setSubfamilia(String subfamilia) {
	this.subfamilia = subfamilia;
}

public String getNomeingles() {
	return nomeingles;
}

public void setNomeingles(String nomeingles) {
	this.nomeingles = nomeingles;
}

public String getEstadoConservacao() {
	return estadoConservacao;
}

public void setEstadoConservacao(String estadoConservacao) {
	this.estadoConservacao = estadoConservacao;
}


public void salvar() {
 new AveDao().catalogar(this);
}

public void excluir (int codigoAve) {
	new AveDao().ExcluirAve(codigoAve);
}

public Ave buscarAvePorCodigo (int codigoAve) {
	return new AveDao().BuscarAvePorCodigo(codigoAve);
}

public ArrayList<Ave> buscarAvePorNomeIngles (String nomeIngles){
	return new AveDao().BuscarAvePorNomeIngles(nomeIngles);
}

/*Teste*/



public void alterar() { 
 new AveDao().AlterarRegistro(this); 
}


}
