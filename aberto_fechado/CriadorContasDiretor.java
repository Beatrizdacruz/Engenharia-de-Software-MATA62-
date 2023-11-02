public class CriadorContasDiretor implements ICriadorContas{
    public Empregado criar(ICandidato){
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setDiretor(true);
        return empregado;
    }
}