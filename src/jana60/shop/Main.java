package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto Cell = new Prodotto("Apple","Iphone", 899, 20 );
		
		
		
		System.out.println("Il prezzo compreso di Iva è " + Cell.prezzoIvato());
	}

}
