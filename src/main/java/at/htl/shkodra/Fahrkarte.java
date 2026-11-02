package at.htl.shkodra;

/**
 * Preis einer Busfahrkarte Shkodra–Tirana.
 * Schüler zahlen die Hälfte, Kinder unter 6 fahren gratis.
 */
public class Fahrkarte {

    public static final int GRUNDPREIS_LEK = 400;

    public static int preis(int alter, boolean schueler) {
        if (alter < 0) {
            throw new IllegalArgumentException("Alter darf nicht negativ sein: " + alter);
        }
        if (alter < 6) {
            return 0;
        }
        if (schueler) {
            return GRUNDPREIS_LEK / 2;
        }
        return GRUNDPREIS_LEK;
    }
}
