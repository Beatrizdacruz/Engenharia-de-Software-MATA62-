package modelo;

public class Candidato implements ICandidato {

	private String nome;
	private String sobrenome;
	private TipoCandidato TipoCandidato = TipoCandidato.GENERICO;
	
	public Candidato(String nome, String sobrenome, TipoCandidato tipoCandidato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoCandidato = tipoCandidato;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public String getTipoCandidato(){
		return TipoCandidato();
	}

	public ICriadorContas obterCriadorContas(){
		return new CriadorContas();
	}
}
