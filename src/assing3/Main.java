package assing3;

public class Main {

	public static void main(String[] args) {
		
		//non mi ricordo la tua data di nascita sorry 
		Data data1 = new Data(24,06,2000);
		Data data2 = new Data(30,11,2022);
		
		//Elettore elettore1 = new Elettore("Nuca","Stoial",);
		
		//la data non è corretta
		Elettore elettore2 = new Elettore("Bamon","Dianchi",data2,"Milano","Italia","maschio","BNCDMN00S30F205O");
		
		//sesso non corretto
		Elettore elettore3 = new Elettore("Bamon","Dianchi",data1,"Milano","Italia","Panzerkampfwagen VI Tiger I","BNCDMN00S30F205O");
		
		
	
		Elettore elettore4 = new Elettore("Bamon","Dianchi",data1,"Milano","Italia","maschio","BNCDMN00S30F205O");
		
		System.out.println(elettore4.getVoto());
		elettore4.esprimi_voto();
		System.out.println(elettore4.getVoto());
		elettore4.esprimi_voto();
		
		
		
	
	    System.out.println("Massimo tra 1 e 2 = " + maxPositiveIntegers(1, 2));//chiamata corretta che soddisfa la precondizione
	    System.out.println("Massimo tra -1 e 2 = " + maxPositiveIntegers(-1, 2));//chiamata errata che viola la precondizione
		
		
		
	}
	
	
	
	//Precondizione: i parametri di input devono essere non negativi
			//@ requires  a>= 0 && b >=0;
			//Postcondizione: il risultato deve essere il massimo tra i due parametri
			//@ ensures (a >= b && \result == a) || (b > a && \result == b);
			//oppure, in modo equivalente
			//@ ensures (a >= b ==> \result == a) && (b > a ==> \result == b);
	static public int maxPositiveIntegers(int a, int b) {
		return Math.max(a, b);
	}
	
}
	
