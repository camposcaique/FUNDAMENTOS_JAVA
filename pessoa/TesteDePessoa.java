package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "33322211";
        pessoa1.nome = "Caique";
        pessoa1.idade = 29;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "11122233";
        pessoa2.nome = "Ruth";
        pessoa2.idade = 25;

        System.out.println(pessoa2.imprimirDadosDaPessoa(1));
    }
}
