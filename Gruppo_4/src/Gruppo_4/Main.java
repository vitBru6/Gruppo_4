package Gruppo_4;

public class Main {

	public static void main(String[] args) {
		Scanner scanner;

		scanner = new Scanner(System.in);
		
		int numGiocatori;
		
		do{
			System.out.println("inserisci numero di giocatori (massimo 4): ");
			numGiocatori = scanner.nextInt();
		}
		while(numGiocatori>=5);
		
		
		//String giocatore1 = scanner.nextLine();
		
		System.out.println("inserisci nome giocatore 1 : " );
		Giocatore giocatore1 = new Giocatore ("", 1);
		System.out.println(giocatore1);
		
		System.out.println("inserisci nome giocatore 2 : " );
		Giocatore giocatore2 = new Giocatore ("", 2);
		System.out.println(giocatore2);	

		System.out.println("inserisci nome giocatore 3 : " );
		Giocatore giocatore3 = new Giocatore ("", 3);
		System.out.println(giocatore3);	

		
		System.out.println("inserisci nome giocatore 4 : " );
		Giocatore giocatore4 = new Giocatore ("", 4);
		System.out.println(giocatore4);	
		
		
		scanner.close();
	}

}
