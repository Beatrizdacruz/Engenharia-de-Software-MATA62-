package br.ufba.idp;

public class Tarefa implements ITarefa {
	
	private String nome;
	private IFuncionario responsavel;
	private double horasTrabalhadas;
	private boolean completa = false;
	
    public void realizarTrabalho(double horas)
    {
        this.horasTrabalhadas += horas;
		IMecanismoLog log = new Fabrica.criarMecanismoLog();
        log.log("Trabalho realizado em " + nome + ".");
    }

    public void completarTarefa()
    {
        completa = true;

        IMecanismoLog log = new Fabrica.criarMecanismoLog();
        log.log("Tarefa " + nome + " completa.");

        IMecanismoMensagem mecanismoMensagem= new Fabrica.criarMecanismoMensagem();
        mecanismoMensagem.enviarMensagem(responsavel, "A tarefa " + nome + " foi finalizada.");
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public IFuncionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(IFuncionario responsavel) {
		this.responsavel = responsavel;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public boolean isCompleta() {
		return completa;
	}
	
	
}
