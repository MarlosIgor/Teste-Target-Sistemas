package Questao_3;

import java.util.List;

public class FaturamentoUtil {

    public static Double menorValorPorMes(List<DadosFaturamento> faturamentos, int diaDoMes) {
        var menorValor = faturamentos
                .stream()
                .filter(e -> e.getDia() == diaDoMes)
                .map(DadosFaturamento::getValor).sorted().toList();

        return menorValor.get(0);
    }

    public static Double maiorValorPorMes(List<DadosFaturamento> faturamentos, int diaDoMes) {
        var menorValor = faturamentos
                .stream()
                .filter(e -> e.getDia() == diaDoMes)
                .map(DadosFaturamento::getValor).sorted().toList();

        return menorValor.get(menorValor.size() - 1);
    }

    public static Double menorValorDeTodos(List<DadosFaturamento> faturamentos) {
        var menorValor = faturamentos
                .stream()
                .map(DadosFaturamento::getValor).sorted().toList();

        return menorValor.get(0);
    }

    public static Integer faturamentoMaiorQueAMedia(List<DadosFaturamento> faturamentos, double media) {
        int quantidadeMaiorQueAMedia = 0;

        for (DadosFaturamento faturamento : faturamentos) {
            if (faturamento.getValor() > media) {
                quantidadeMaiorQueAMedia++;
            }
        }
        return quantidadeMaiorQueAMedia;
    }

    public static Double calculaMedia(List<DadosFaturamento> faturamentos) {

        double sum = faturamentos.stream()
                .map(e -> e.getValor())
                .mapToDouble(Double::doubleValue)
                .sum();
        return sum / faturamentos.size();
    }
}
