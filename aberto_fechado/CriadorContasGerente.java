public class CriadorContasGerente implements ICriadorContas{
    public Empregado criar(ICandidato){
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setgerente(true);
        return empregado;
    }
    
}