package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto Cell = new Prodotto("Apple","Iphone", 899.34, 22 );
		Prodotto Computer = new Prodotto("Microsoft", "PersonalPC", 695, 22 );
		Prodotto VideoCamera = new Prodotto("Canon","I550", 237.66, 22);
		Prodotto PennaUSB = new Prodotto("Lenovo", "7Max", 10.16, 22);
		
		
		
		
		System.out.println("Il prezzo del " + Cell.nome + " compreso di Iva è " + Cell.prezzoIvato() + "€");
		System.out.println("Il prezzo del " + Computer.nome + " compreso di Iva è " + Computer.prezzoIvato() + "€");
		System.out.println("Il prezzo della " + VideoCamera.nome + " compreso di Iva è " + VideoCamera.prezzoIvato() + "€");
		System.out.println("Il prezzo della " + PennaUSB.nome + " compreso di Iva è " + PennaUSB.prezzoIvato() + "€");
		System.out.println(Cell.prezzoStringato());
		System.out.println(Computer.prezzoStringato());
		System.out.println(VideoCamera.prezzoStringato());
		System.out.println(PennaUSB.prezzoStringato());
	}

}
