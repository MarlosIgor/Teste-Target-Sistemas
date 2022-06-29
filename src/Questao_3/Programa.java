package Questao_3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Programa {
    public static void main(String[] args) throws IOException {

        String file = "C:\\Target-Sistemas\\src\\Questao_3\\dados.json";
        String json = new String(Files.readAllBytes(Paths.get(file)));

        Type collectionType = new TypeToken<List<DadosFaturamento>>() {
        }.getType();
        List<DadosFaturamento> faturamentos = new Gson().fromJson(json, collectionType);

        System.out.println("O maior valor para o dia 2 é de: " + FaturamentoUtil.maiorValorPorMes(faturamentos, 2));

        System.out.println("O menor valor para o dia 30 é de: " + FaturamentoUtil.menorValorPorMes(faturamentos, 30));

        System.out.println("O menor valor de todo o mes é de: " + FaturamentoUtil.menorValorDeTodos(faturamentos));

        System.out.printf("Foram " + FaturamentoUtil.faturamentoMaiorQueAMedia(faturamentos, FaturamentoUtil.calculaMedia(faturamentos)) + " dias maiores que a média: %.2f%n", FaturamentoUtil.calculaMedia(faturamentos));

    }
}
