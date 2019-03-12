package main.URI_1001;

import main.URI;

import java.util.Scanner;

public class URI_1001 extends URI {

    public static final String TEMPLATE_SAIDA = "X = ";

    @Override
    public String getExercicio() {
        return "1001";
    }

    @Override
    public void core() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getResultadoFinal(scanner.nextInt(), scanner.nextInt()));
    }

    public static String getResultadoFinal(int A, int B){
        return TEMPLATE_SAIDA + soma(A, B);
    }

    private static int soma(int A, int B){
        return A+B;
    }
}
