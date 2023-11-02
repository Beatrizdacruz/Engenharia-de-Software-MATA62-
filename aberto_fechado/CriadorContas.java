package modelo;

public class CriadorContas implements ICriadorContas{
    public Empregado criar(ICandidato candidato)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        return empregado;
    }
}
