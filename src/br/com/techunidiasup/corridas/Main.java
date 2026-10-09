package br.com.techunidiasup.corridas;

import java.util.Locale;

public class Main {

    private static final String LINHA_SEPARADORA = "==========================================";

    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Carlos Silva", "ABC-1D23");
        Motorista premium = new MotoristaPremium("Ana Souza", "XYZ-9K87");
        Motorista frotista = new MotoristaParceiroFrotista("Bruno Lima", "QWE-4R56");

        registrarCorridasDoIniciante(iniciante);
        registrarCorridasDoPremium(premium);
        registrarCorridasDoFrotista(frotista);

        imprimirExtrato(iniciante);
        imprimirExtrato(premium);
        imprimirExtrato(frotista);
    }

    private static void registrarCorridasDoIniciante(Motorista motorista) {
        motorista.registrarCorrida(35.50);
        motorista.registrarCorrida(22.00);
        motorista.registrarCorrida(48.75);
    }

    private static void registrarCorridasDoPremium(Motorista motorista) {
        double[] valoresDasCorridas = {40.00, 55.50, 30.00, 72.25, 18.90, 64.00};

        for (double valorDaCorrida : valoresDasCorridas) {
            motorista.registrarCorrida(valorDaCorrida);
        }
    }

    private static void registrarCorridasDoFrotista(Motorista motorista) {
        for (int numeroDaCorrida = 1; numeroDaCorrida <= 40; numeroDaCorrida++) {
            motorista.registrarCorrida(45.00);
        }
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println(LINHA_SEPARADORA);
        System.out.println("        EXTRATO MENSAL DO MOTORISTA");
        System.out.println(LINHA_SEPARADORA);
        System.out.println("Nome..............: " + motorista.getNome());
        System.out.println("Placa.............: " + motorista.getPlacaDoVeiculo());
        System.out.println("Categoria.........: " + motorista.getCategoria());
        System.out.println("Corridas no mes...: " + motorista.getQuantidadeDeCorridasNoMes());
        System.out.println("Valor bruto.......: " + formatarComoMoeda(motorista.getValorTotalBruto()));
        System.out.println("Liquido a receber.: " + formatarComoMoeda(motorista.calcularPagamentoLiquido()));
        System.out.println(LINHA_SEPARADORA);
        System.out.println();
    }

    private static String formatarComoMoeda(double valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %,.2f", valor);
    }
}
