public class CandidatoDiretor implements ICandidato{

    public String nome;
    public String Sobrenome;

    public CandidatoDiretor(String nome, String sobrenome, TipoCandidato tipoCandidato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoCandidato = tipoCandidato;
	}
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }

    public ICriadorContas obterCriador(){
        return new CriadorContasDiretor();
    }
}