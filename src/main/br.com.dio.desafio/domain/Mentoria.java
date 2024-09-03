package domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {

    private String titulo;
    private String descricao;
    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
