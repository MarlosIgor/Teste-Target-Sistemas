package Questao_3;

import com.google.gson.annotations.SerializedName;

public class DadosFaturamento {

    @SerializedName("dia")
    public int dia;

    @SerializedName("valor")
    public Double valor;

    public int getDia() {
        return dia;
    }

    public Double getValor() {
        return valor;
    }

}
