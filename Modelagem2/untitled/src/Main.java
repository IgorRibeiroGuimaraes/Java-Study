import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Henrique",5f));
        alunos.add(new Aluno("Dayne",3.5f));
        alunos.add(new Aluno("Igor", 10f));

        Aluno alunoMaiorNota = null;
        float maiorNota = 0.0f;
        for (Aluno aluno: alunos) {
        if (aluno.getNota() > maiorNota){
            alunoMaiorNota = aluno;
            maiorNota = aluno.getNota();
        }
        }
        Aluno alunoMenorNota = null;
        float menorNota = 6.0f;
        for (Aluno aluno: alunos) {
            if (aluno.getNota() < menorNota){
                alunoMenorNota = aluno;
                menorNota = aluno.getNota();
            }
        }


        System.out.println(alunoMaiorNota);
        System.out.println(maiorNota);
        System.out.println(alunoMenorNota);
        System.out.println(menorNota);

    }
}