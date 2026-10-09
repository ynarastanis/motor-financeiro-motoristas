package br.com.techunidiasup.corridas;

public abstract class Motorista {

    private final String nome;
    private final String placaDoVeiculo;
    private int quantidadeDeCorridasNoMes;
    private double valorTotalBruto;

    protected Motorista(String nome, String placaDoVeiculo) {
        this.nome = nome;
        this.placaDoVeiculo = placaDoVeiculo;
        this.quantidadeDeCorridasNoMes = 0;
        this.valorTotalBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        validarValorDaCorrida(valor);
        this.quantidadeDeCorridasNoMes++;
        this.valorTotalBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public int getQuantidadeDeCorridasNoMes() {
        return quantidadeDeCorridasNoMes;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }

    public abstract String getCategoria();

    private void validarValorDaCorrida(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da corrida deve ser maior que zero.");
        }
    }
}
