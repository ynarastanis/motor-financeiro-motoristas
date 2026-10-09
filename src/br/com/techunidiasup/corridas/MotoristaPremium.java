package br.com.techunidiasup.corridas;

public class MotoristaPremium extends Motorista {

    private static final double PERCENTUAL_RECEBIDO = 0.85;
    private static final double BONUS_POR_CORRIDA = 2.00;

    public MotoristaPremium(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor + BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorTotalBruto() * PERCENTUAL_RECEBIDO;
    }

    @Override
    public String getCategoria() {
        return "Premium";
    }
}
