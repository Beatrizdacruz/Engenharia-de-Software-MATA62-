import java.util.List;

public class GerenciadorTributario {
    private CalcularImposto calculadoraImposto;
    private RegistroImposto registradorImposto;

    public GerenciadorTributario(CalcularImposto calculadoraImposto, RegistroImposto registradorImposto) {
        this.calculadoraImposto = calculadoraImposto;
        this.registradorImposto = registradorImposto;
    }

    public void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes) {
        double imposto = 0;
        for (Venda venda : vendasMes) {
            imposto += calculadoraImposto.calcularImposto(venda);
        }

        registradorImposto.registrarTotalImposto(ano, mes, imposto);
    }
}
