package org.lessons.java.shop;
public class Prodotto {

    // VARIABILI DI ISTANZA, PROPRIETA' ECC
    public int codice;
    public String nome;
    public String descrizione;
    public int prezzo;
    public int iva;

    public Prodotto(int codice, String nome, String descrizione, int prezzo, int iva) {
        // CODICE (PRODOTTO));
        this.codice = codice;
        // NOME (PRODOTTO)
        this.nome = nome;
        // DESCRIZIONE (PRODOTTO)
        this.descrizione = descrizione;
        // PREZZO (PRODOTTO)
        this.prezzo = prezzo;
        // CALCOLO IVA (PRODOTTO)
        this.iva = iva;
    }
    // METODI
    public String codice(){
        return "Codice Prodotto: " + codice;
    }
    

}
