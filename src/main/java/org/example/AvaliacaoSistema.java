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
    
    public static void getAvalicaoFinao(AlunoDD aluno){
        double mediaFinal = aluno.tri1Total + aluno.tri2Total + aluno.tri3Total;
        if(mediaFinal == 0){
            System.out.println("Notas abaixo da media, recuperação e atencão nescessarias!");
        } else if(mediaFinal > 0 && mediaFinal <= 3.9999){
            System.out.println("Notas baixissimas, recuperação e atencão nescessarias!");
        } else if(mediaFinal >= 4 && mediaFinal <= 5.9999){
            System.out.println("Notas abaixo da media, recuperação e atencão nescessarias!");
        } else if(mediaFinal >= 6 && mediaFinal <= 7.9999){
            System.out.println("Notas dentro da media, nescessario aperfeiçoamento!");
        } else if(mediaFinal >= 8 && mediaFinal <= 9.9999){
            System.out.println("Notas altas de bom desempenho, parabens!");
        }else if(mediaFinal == 10){
            System.out.println("Notas perfeitas, parabens!");
        }
    }

}
