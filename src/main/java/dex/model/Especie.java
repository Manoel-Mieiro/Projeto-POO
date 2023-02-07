package dex.model;

import java.util.ArrayList;

public class Especie {
	private Integer codigoEspecie; 
	private  String reino;
	private  String filo;
	private  String ordem;
	private  ArrayList <Ave> aves = new ArrayList <Ave> ();
	
	public Especie () {
		
	}

	public Especie(String reino, String filo, String ordem, ArrayList<Ave> aves) {
		super();
		this.reino = reino;
		this.filo = filo;
		this.ordem = ordem;
		this.aves = aves;
	}

	public Especie(Integer codigoEspecie, String reino, String filo, String ordem, ArrayList<Ave> aves) {
		super();
		this.codigoEspecie = codigoEspecie;
		this.reino = reino;
		this.filo = filo;
		this.ordem = ordem;
		this.aves = aves;
	}

	public Integer getCodigoEspecie() {
		return codigoEspecie;
	}

	public void setCodigoEspecie(Integer codigoEspecie) {
		this.codigoEspecie = codigoEspecie;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public ArrayList<Ave> getAves() {
		return aves;
	}

	public void setAves(ArrayList<Ave> aves) {
		this.aves = aves;
	}


	
	
}
