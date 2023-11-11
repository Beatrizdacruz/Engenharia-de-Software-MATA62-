public class RegistroImposto implements IRegistroImposto {
    @Override
    public void registrarTotalImposto(int ano, int mes, double imposto) {
        BancoDados banco = new BancoDados();
        banco.save(ano, mes, imposto);
    }
}
