package Command;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LigarCommandTest {
    @Test
    void testExecute() {
        LigarCommand ligar = new LigarCommand();

        Lampada lamp = new Lampada();
        ligar.execute(lamp);
        assertTrue(lamp.isLigada());
        
        Televisao tv = new Televisao();
        ligar.execute(tv);
        assertTrue(tv.isLigada());

    }

    @Test
    void testUndo() {
        LigarCommand ligar = new LigarCommand();

        Lampada lamp = new Lampada();
        ligar.undo(lamp);
        assertFalse(lamp.isLigada());

        Televisao tv = new Televisao();
        ligar.undo(tv);
        assertFalse(tv.isLigada());

    }
}
