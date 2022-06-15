package jana60.shop;

public class Prodotto {

	//attributi
	String marca;
	String nome;
	double prezzo;
	int iva;
	
	//costruttori
	
	Prodotto (String marca, String nome, double prezzo, int iva) {
		this.marca = marca; 
		this.nome = nome;
		this.prezzo = prezzo;		
		this.iva = iva;
	} 
	
	//metodi
	
	//calcolare il prezzo comprensivo di iva
	double prezzoIvato ()  {
		return prezzo +(prezzo * iva / 100);			
	}
	
	//formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere €
	 
}
