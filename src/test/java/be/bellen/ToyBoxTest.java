package be.bellen;

import org.junit.Test;

public class ToyBoxTest {
    @Test
    public void play() throws Exception {
        ToyBox.play(box -> box.lego().meccano());
    }
}