package jana60.shop;

import java.text.DecimalFormat;

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
	DecimalFormat prezzoStringato = new DecimalFormat ("##.00");
		String prezzoStringato () {
			return ("Il prezzo stringato è " + prezzoStringato.format(prezzoIvato()) + "€");
		}
		
	
}
