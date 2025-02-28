package org.example;

public class AlunoDD {
    String nome;
    double tri1nt1;
    double tri1nt2;
    double tri1nt3;
    double tri1Total;
    double tri2nt1;
    double tri2nt2;
    double tri2nt3;
    double tri2Total;
    double tri3nt1;
    double tri3nt2;
    double tri3nt3;
    double tri3Total;

    public AlunoDD(String nome_aluno){
        nome = nome_aluno;
    }

    public void getAluno(){
        System.out.println(nome);
        System.out.println("Nota 1 tri 1: "+tri1nt1);
        System.out.println("Nota 2 tri 1: " + tri1nt2);
        System.out.println("Nota 3 tri 1: "+tri1nt3);
        System.out.println("Media tri 1: "+tri1Total);
        System.out.println("Nota 1 tri 2: "+tri2nt1);
        System.out.println("Nota 2 tri 2: " + tri2nt2);
        System.out.println("Nota 3 tri 2: "+tri2nt3);
        System.out.println("Media tri 2: "+tri2Total);
        System.out.println("Nota 1 tri 1: "+tri1nt1);
        System.out.println("Nota 2 tri 3: " + tri3nt2);
        System.out.println("Nota 3 tri 3: "+tri3nt3);
        System.out.println("Media tri 3: "+tri3Total);
    }

    public void setMediaTri1(double media){
        tri1Total = media;
    }

    public void setMediaTri2(double media){
        tri2Total = media;
    }

    public void setMediaTri3(double media){
        tri3Total = media;
    }

    public void setNotasTri1(double nt1, double nt2, double nt3){

        tri1nt1 = nt1;
        tri1nt2 = nt2;
        tri1nt3 = nt3;
    }

    public void setNotasTri2(double nt1, double nt2, double nt3){
        tri2nt1 = nt1;
        tri2nt2 = nt2;
        tri2nt3 = nt3;
    }

    public void setNotasTri3(double nt1, double nt2, double nt3){
        tri3nt1 = nt1;
        tri3nt2 = nt2;
        tri3nt3 = nt3;
    }
}
