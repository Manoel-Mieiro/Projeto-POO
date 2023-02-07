package dex.model;



import dex.dao.AlunoDao;


public class Aluno {
	private Integer codigoAluno;
	private String matricula;
	private String nomeCompleto;
	private String emailResponsavel;
	private String endereco;
	private String dataNascimento;
	// private ArrayList <Registro> registros = new ArrayList <Registro> ();

	public Aluno() {

	}


	public Aluno(String matricula, String nomeCompleto, String emailResponsavel, 
			String endereco, String dataNascimento) {
		super();
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.emailResponsavel = emailResponsavel;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}


	public Aluno(Integer codigoAluno, String matricula, String nomeCompleto,
			String emailResponsavel, String endereco, String dataNascimento/* , ArrayList<Registro> registros */) {
		super();
		this.codigoAluno = codigoAluno;
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.emailResponsavel = emailResponsavel;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		// this.registros = registros;
	}

	public Integer getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(Integer codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/*
	 * public ArrayList<Registro> getRegistros() { return registros; }
	 * 
	 * public void setRegistros(ArrayList<Registro> registros) { this.registros =
	 * registros; }
	 */
	public void logar() {
		new AlunoDao().entrar(this);
	}
}
