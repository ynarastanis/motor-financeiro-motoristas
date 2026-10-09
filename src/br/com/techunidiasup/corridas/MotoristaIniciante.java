package br.com.techunidiasup.corridas;

public class MotoristaIniciante extends Motorista {

    private static final double PERCENTUAL_RECEBIDO = 0.75;
    private static final int MINIMO_DE_CORRIDAS_SEM_PENALIDADE = 5;
    private static final double TAXA_DE_INATIVIDADE = 50.00;

    public MotoristaIniciante(String nome, String placaDoVeiculo) {
        super(nome, placaDoVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorTotalBruto() * PERCENTUAL_RECEBIDO;

        if (getQuantidadeDeCorridasNoMes() < MINIMO_DE_CORRIDAS_SEM_PENALIDADE) {
            pagamentoLiquido -= TAXA_DE_INATIVIDADE;
        }

        return pagamentoLiquido;
    }

    @Override
    public String getCategoria() {
        return "Iniciante";
    }
}
