package excessoes;

import pessoa.Pessoa;

public class Exceccoes {

    // Checked execption

    // Unchecked exeptions
    
    public static void main(String[] args) {
    //    try {
    //     validarNumero();
    //    } catch (Exception e) {
    //         System.out.println("Deu ruim");
    //         e.printStackTrace();
    //    }

        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception{
         int numero = 10;
        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
