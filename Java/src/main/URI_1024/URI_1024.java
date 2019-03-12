package main.URI_1024;

import main.URI;

import java.util.Scanner;

public class URI_1024 extends URI {

    public URI_1024() {
    }

    @Override
    public String getExercicio() {
        return "1024";
    }

    @Override
    public void core() {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLinhas = scanner.nextInt();

        while (quantidadeLinhas >= 0) {
            Encrypt encrypt = new Encrypt(scanner.nextLine());
            encrypt.executaTodasEtapas();

            System.out.println(encrypt.getEntrada());
            quantidadeLinhas--;
        }

    }
}
