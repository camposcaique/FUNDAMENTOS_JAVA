
/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo de classe
 */
public class HelloWorld {

    // Todo conteúdo deverá ser inderido aqui dentro.
    public static void main(String[] args) {

        /* Valores (int, double, float long)
         * Texto (String)
         * Booleanos (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 4372894037289l;
        String dadoDoTipoString = "Colocar o meu texto";
        Boolean dadoDoTipoBoolean = false;

        // if - else 
        // if(dadoDoTipoInt == 10) {
        //     // sysout
        //     System.out.println("Entrou no if do 10");
        // } if (dadoDoTipoInt < 12) {
        //     System.out.println("Entrou no if do 12");
        // }

        // else {
        //     System.out.println("Entrou no else");
        // }

        // While (Enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial <3) {
            System.out.println("O valor incial é menor que 3");
            System.out.println(valorInicial);
            valorInicial ++; // valorInicial = 3
        }
        System.out.println("Saiu do while");

        // For
        for(int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + is);
        }
        System.out.println("Finalizando o FOR");

    }
    
}
// Fora do escopo da classe