package br.com.escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01   =  new Aluno();
            aluno01.setNome("Lucas");
            aluno01.setRa("1213444");
            aluno01.setAv1(40);
            aluno01.setAv2(50);
            System.out.println("Aluno 1: "+aluno01.getNome()+"\n"+aluno01.getRa());

        Aluno aluno02   =  new Aluno("Anna","123444");
            System.out.println("Aluno 2: "+aluno02.getNome()+"\n"+aluno02.getRa());

        Aluno aluno03   =  new Aluno("Joao","12115835",40.5f,38.0f);
        System.out.println("Aluno 3: "+aluno03.getNome()+"\n"+aluno03.getRa()+"\n"+(aluno03.getAv1()+aluno03.getAv2()));



    }
}