package DesafioDio.POO;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.time.LocalDate;

public class Mentoria extends conteudos {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }

}
