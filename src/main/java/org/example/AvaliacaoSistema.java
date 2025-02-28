package org.example;

public class AvaliacaoSistema {
    
    public static double getCalculoMediaTri1(double nota1, double nota2, double nota3){
        double n = 3 / (nota1 + nota2 + nota3);
        return n;
    }

    public static double getCalculoMediaTri2(double nota1, double nota2, double nota3){
        double n = 3 / (nota1 + nota2 + nota3);
        return n;
    }

    public static double getCalculoMediaTri3(double nota1, double nota2, double nota3){
        double n = 3 / (nota1 + nota2 + nota3);
        return n;
    }

    public static void setNotasAlunos (AlunoDD aluno){
        double nt1 = getCalculoMediaTri1(aluno.tri1nt1, aluno.tri1nt2, aluno.tri1nt3);
        aluno.setMediaTri1(nt1);
        double nt2 = getCalculoMediaTri2(aluno.tri2nt1, aluno.tri2nt2, aluno.tri2nt3);
        aluno.setMediaTri2(nt2);
        double nt3 = getCalculoMediaTri3(aluno.tri3nt1, aluno.tri3nt2, aluno.tri3nt3);
        aluno.setMediaTri3(nt3);
        System.out.println("Médias calculadas e gravadas.");
    }

}
