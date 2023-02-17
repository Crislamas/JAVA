package tiposprimitivos;

import java.util.Scanner;

public class leituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        System.out.println("Você digitou:  " + idade);

        System.out.println("Digite a largura do seu terreno");
        double largura = scan.nextDouble();
        System.out.println("Você digitou: " + largura);

    }
    
}