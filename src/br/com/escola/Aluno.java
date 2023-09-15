package br.com.escola;

public class Aluno {
    private String nome;
    private String ra;
    private float av1;
    private float av2;

    public Aluno(String nome, String ra, float av1, float av2) {
        this.nome = nome;
        this.ra = ra;
        this.av1 = av1;
        this.av2 = av2;
    }

    public Aluno() {
    }

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public float getAv1() {
        return av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }
}
