package Questao_4.src;

public class ValorMensal {
    public static void main(String[] args) {
        double saoPaulo = 67.83643;
        double rioDeJaneiro = 36.67866;
        double minasGerais = 29.22988;
        double espirtoSanto = 27.16548;
        double outros = 19.84953;
        double totalEstados = (saoPaulo + rioDeJaneiro + minasGerais + espirtoSanto + outros);

        System.out.printf("Valor total: %.2f%n",totalEstados);
        double porcSaoPaulo = ((saoPaulo / totalEstados) * 100);
        double porcRioDeJaneiro = ((rioDeJaneiro / totalEstados) * 100);
        double porcMinasGerais = ((minasGerais / totalEstados) * 100);
        double porcEspirtoSanto = ((espirtoSanto / totalEstados) * 100);
        double porcOutros = ((outros / totalEstados) * 100);

        System.out.printf("Porcentagem de São Paulo %.2f%s%n", porcSaoPaulo, "%");
        System.out.printf("Porcentagem de Rio Janeiro %.2f%s%n", porcRioDeJaneiro, "%");
        System.out.printf("Porcentagem de Minas Gerais %.2f%s%n", porcMinasGerais, "%");
        System.out.printf("Porcentagem de Espirito Santo %.2f%s%n", porcEspirtoSanto, "%");
        System.out.printf("Porcentagem de Outros % .2f%s%n", porcOutros, "%");
    }
}
