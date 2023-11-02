public class CandidatoGerente implements ICandidato{

    private String nome;
    private String getSobrenome

    public CandidatoGerente(String nome, String sobrenome, TipoCandidato tipoCandidato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoCandidato = tipoCandidato;
	}	

    public String getNome(){
        return null;
    }

    public String getSobrenome(){
        return null;
    }

    public ICriadorContas obterCriadorContas(){
        return new CriadorContasGerente();
    }

}