package main.URI_2717;

import main.URI;

import java.util.Scanner;

public class URI_2717 extends URI {

    public static final String FAREI_HOJE = "Farei hoje!";
    public static final String DEIXA_PARA_AMANHA = "Deixa para amanha!";

    public static String getResultadoFinal(int minutosRestantesDoExpediente, int minutosNecessariosParaFabricarPresente1, int minutosNecessariosParaFabricarPresente2) {
        return isTempoNecessario(minutosRestantesDoExpediente, minutosNecessariosParaFabricarPresente1, minutosNecessariosParaFabricarPresente2) ?
                FAREI_HOJE :
                DEIXA_PARA_AMANHA;
    }

    private static boolean isTempoNecessario(int minutosRestantesDoExpediente, int minutosNecessariosParaFabricarPresente1, int minutosNecessariosParaFabricarPresente2) {
        return (minutosNecessariosParaFabricarPresente1 + minutosNecessariosParaFabricarPresente2) <= minutosRestantesDoExpediente;
    }

    @Override
    public String getExercicio() {
        return "2717";
    }

    @Override
    public void core() {
        Scanner scanner = new Scanner(System.in);

        int minutosRestantesDoExpediente = scanner.nextInt();
        int minutosNecessariosParaFabricarPresente1 = scanner.nextInt();
        int minutosNecessariosParaFabricarPresente2 = scanner.nextInt();

        System.out.println(getResultadoFinal(minutosRestantesDoExpediente, minutosNecessariosParaFabricarPresente1, minutosNecessariosParaFabricarPresente2));
    }
}
