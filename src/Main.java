import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael", "TI");

        System.out.println("O Aluno "+aluno1.nome+ " esta fazendo o curso de "+ aluno1.curso);
        System.out.println("Tem "+ aluno1.faltas+ " faltas");

        aluno1.darFaltas(2);
        System.out.println("Tem "+ aluno1.faltas+ " faltas");

        aluno1.darFaltas(49);
        System.out.println("Tem "+ aluno1.faltas+ " faltas");

        aluno1.darNota(80);
        System.out.println("Sua nota é "+aluno1.nota);

        aluno1.darNota(50);
        System.out.println("Sua nota é "+aluno1.nota);

        Aluno aluno2 = new Aluno("Gislene","ADM");
        System.out.println("Aluno2 -> nome="+aluno2.nome+
                " curso="+aluno2.curso+" faltas="+aluno2.faltas+" nota="+aluno2.nota);
        System.out.println("Aluno2 -> nome="+aluno1.nome+
                " curso="+aluno1.curso+" faltas="+aluno1.faltas+" nota="+aluno1.nota);

        List<Aluno> listaDealunos = new ArrayList<>();

        listaDealunos.add(aluno1);
        listaDealunos.add(aluno2);
        listaDealunos.add(new Aluno("Teste","TI"));

        for(Aluno aluno : listaDealunos ){
            System.out.println("Aluno -> nome="+aluno.nome+
                    " curso="+aluno.curso+" faltas="+aluno.faltas+" nota="+aluno.nota);
        }


    }
}
