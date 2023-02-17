/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. */



package tiposprimitivos;

import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        double produto = 139.99;

        System.out.println("O preço do produto é: R$ "  + produto);

        double desconto = produto * 37 / 100;

        System.out.println("Com desconto o valor do produto é: R$  " + desconto);


    }
    
}