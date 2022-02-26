package DesafioDio.POO;

public class Curso extends conteudos {
    private String titulo;


    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }

}
