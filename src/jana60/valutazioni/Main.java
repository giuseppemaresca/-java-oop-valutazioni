package jana60.valutazioni;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// creo l'array vuoto di ClasseStudente
		ClasseStudente[]studenti=new ClasseStudente[3];
		
		// valorizzo l'array di ClasseStudente
		for(int i=0;i<studenti.length;i++) 
		{
			System.out.println("Inserisci le assenze di quest'anno scolastico ;");
			int percAssenze=Integer.parseInt(scanner.nextLine());
			
			System.out.println("Inserisci la media voti di quest'anno ");
			double mediaVoti=Double.parseDouble(scanner.nextLine());
			 studenti[i] = new ClasseStudente(i+1, percAssenze,mediaVoti);
		}
		int numeroPromossi = 0;
		for(int i=0;i<studenti.length;i++) 
		{
         if(studenti[i].esito())
         {
        	 System.out.println("Lo studente " +studenti[i].idStudenti+" è stato promosso!");
        	 numeroPromossi++;
         }
         else {
        	   System.out.println("Lo studente " +studenti[i].idStudenti+" è stato bocciato!");
         }
		}
	System.out.println("Il totale di studenti promossi è "+ numeroPromossi);
	}

}
