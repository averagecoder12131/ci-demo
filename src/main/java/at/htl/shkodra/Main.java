package at.htl.shkodra;

public class Main {
    public static void main(String[] args) {
        System.out.println("Erwachsener:  " + Fahrkarte.preis(35, false) + " Lek");
        System.out.println("Schülerin:    " + Fahrkarte.preis(17, true) + " Lek");
        System.out.println("Kind (4):     " + Fahrkarte.preis(4, false) + " Lek");
    }
}
