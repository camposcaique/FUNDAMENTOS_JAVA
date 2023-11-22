package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("33322211");
        professor.setNome("Caique");
        professor.setIdade(29);
        professor.setSalario(50000);
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("11554433");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        aluno.setMatricula("190190");
        System.out.println(professor.imprimirDadosDaPessoa());

    }
}
