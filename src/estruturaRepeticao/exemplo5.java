package estruturaRepeticao;

import java.util.Scanner;

public class exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Digite uma idade: ");
            idade = leitor.nextInt();
            System.out.println("idade invalido");

        }while(idade < 18);
        System.out.println("maior que 18 anos");


    }
}
