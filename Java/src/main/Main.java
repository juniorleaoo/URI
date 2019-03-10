package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quantidadeLinhas;
        Scanner scanner = new Scanner(System.in);
        quantidadeLinhas = scanner.nextInt();


        while (quantidadeLinhas >= 0) {
            Encrypt encrypt = new Encrypt(scanner.nextLine());
            encrypt.executaTodasEtapas();

            System.out.println(encrypt.getEntrada());
            quantidadeLinhas--;
        }

    }

}
