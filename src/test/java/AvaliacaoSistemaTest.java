import org.example.AlunoDD;
import org.example.AvaliacaoSistema;
import org.junit.Test;

public class AvaliacaoSistemaTest {

    AlunoDD alunoTest = new AlunoDD("Daniel");

    @Test
    public void setNotasTri1AlunoTest(){

        double nt1 = 5.5;
        double nt2 = 5;
        double nt3 = 8;

        alunoTest.setNotasTri1(nt1, nt2, nt3);

        System.out.println("Notas tr1 definidas com sucesso!");
    }

    @Test
    public void setNotasTri2AlunoTest(){

        double nt1 = 5.5;
        double nt2 = 5;
        double nt3 = 8;

        alunoTest.setNotasTri1(nt1, nt2, nt3);

        System.out.println("Notas tri2 definidas com sucesso!");
    }

    @Test
    public void setNotasTri3AlunoTest(){

        double nt1 = 5.5;
        double nt2 = 5;
        double nt3 = 8;

        alunoTest.setNotasTri1(nt1, nt2, nt3);

        System.out.println("Notas tri3 definidas com sucesso!");
    }

    @Test
    public void setMediasTest(){
        AvaliacaoSistema.setNotasAlunos(alunoTest);
    }

    @Test
    public void getAlunoTest(){
        alunoTest.getAluno();
    }
    
    @Test
    public void getAvaliacaoFinal(){
        AvaliacaoSistema.getAvalicaoFinao(alunoTest);
    }

}
