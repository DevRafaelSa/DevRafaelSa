public class CalculadoraImposto {

    private double totalImposto;

    public void registra(Tributável t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
