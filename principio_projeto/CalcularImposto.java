public class CalcularImposto implements ICalculadorImposto {
    @Override
    public double calcularImposto(Venda venda) {
        if (venda.getValor() < 1000)
            return 0.05 * venda.getValor();
        else
            return 0.07 * venda.getValor();

    }

}
