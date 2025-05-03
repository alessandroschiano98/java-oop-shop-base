package org.lessons.java.shop;

public class ProdottoMain {
    public static void main(String[] args) {
        Prodotto shampoo = new Prodotto("Head&Shoulders", "Antiforfora", 9.0f, 22);

        System.out.println("Codice: " + shampoo.getCodice());
        System.out.println("Nome: " + shampoo.getNome());
        System.out.println("Descrizione: " + shampoo.getDescrizione());
        System.out.println("Prezzo: " + shampoo.getPrezzo() + "€");
        System.out.println("Prezzo con IVA: " + shampoo.getPrezzoConIva() + "€");

    }

}
