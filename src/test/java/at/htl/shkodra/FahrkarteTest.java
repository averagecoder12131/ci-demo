package at.htl.shkodra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrkarteTest {

    @Test
    void erwachsenerZahltDenGrundpreis() {
        assertEquals(400, Fahrkarte.preis(35, false));
    }

    @Test
    void schuelerZahltDieHaelfte() {
        assertEquals(200, Fahrkarte.preis(17, true));   // live auf 250 ändern -> roter Lauf
    }

    @Test
    void kindUnterSechsFaehrtGratis() {
        assertEquals(0, Fahrkarte.preis(5, false));
    }

    @Test
    void negativesAlterIstEinFehler() {
        assertThrows(IllegalArgumentException.class, () -> Fahrkarte.preis(-1, false));
    }
}
