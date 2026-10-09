package br.com.techunidiasup.corridas;

public class MotoristaParceiroFrotista extends Motorista {

    private static final double PERCENTUAL_RECEBIDO = 0.80;
    private static final double ALUGUEL_DO_VEICULO = 800.00;
    private static final double PAGAMENTO_MINIMO = 0.0;

    public MotoristaParceiroFrotista(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = (getValorTotalBruto() * PERCENTUAL_RECEBIDO) - ALUGUEL_DO_VEICULO;

        return Math.max(pagamentoLiquido, PAGAMENTO_MINIMO);
    }

    @Override
    public String getCategoria() {
        return "Parceiro Frotista";
    }
}
