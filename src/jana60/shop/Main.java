package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto Cell = new Prodotto("Apple","Iphone", 899, 22 );
		Prodotto Computer = new Prodotto("Microsoft", "PersonalPC", 695, 22 );
		Prodotto VideoCamera = new Prodotto("Canon","I550", 237, 22);
		
		
		
		
		System.out.println("Il prezzo del " + Cell.nome + " compreso di Iva è " + Cell.prezzoIvato() + "€");
		System.out.println("Il prezzo del " + Computer.nome + " di Iva è " + Computer.prezzoIvato() + "€");
		System.out.println("Il prezzo della " + VideoCamera.nome + " di Iva è " + VideoCamera.prezzoIvato() + "€");
	}

}
