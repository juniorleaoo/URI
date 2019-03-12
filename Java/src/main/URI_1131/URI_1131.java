package main.URI_1131;

import java.io.IOException;
import java.util.Scanner;
 
public class URI_1131 {
 
    public static void main(String[] args) throws IOException {
        int vitoriaGremio = 0, vitoriaInter = 0, empates = 0, golsInter = 0, golsGremio = 0, opcao;

		Scanner scanner = new Scanner(System.in);

		do {
			golsInter = scanner.nextInt();
			golsGremio = scanner.nextInt();

			if(golsInter > golsGremio) {
				vitoriaInter++;

			}else if(golsInter < golsGremio) {
				vitoriaGremio++;

			}else {
				empates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = scanner.nextInt();
			
		}while(opcao == 1);
		
		System.out.println(vitoriaInter+vitoriaGremio+empates + " grenais");
		System.out.println("Inter:"+vitoriaInter);
		System.out.println("Gremio:"+vitoriaGremio);
		System.out.println("Empates:"+empates);
		System.out.println( (vitoriaInter>vitoriaGremio) ? "Inter venceu mais" : (vitoriaInter<vitoriaGremio ? "Gremio venceu mais" : "Nao houve vencedor"));
 
    }
 
}
