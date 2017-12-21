import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int tempo = 0, tempo1 = 0, tempo2 = 0;

		Scanner scanner = new Scanner(System.in);

		tempo = scanner.nextInt();
		tempo1 = scanner.nextInt();
		tempo2 = scanner.nextInt();
		
		if( (tempo1+tempo2) <= tempo ) {
			System.out.println("Farei hoje!");
		
		}else {
			System.out.println("Deixa para amanha!");
			
		}
 
    }
 
}