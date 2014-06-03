package be.bellen;

import java.util.function.Consumer;

public class ToyBox {

    private ToyBox() {
        open();
    }

    public static void play(final Consumer<ToyBox> block) {
        final ToyBox box = new ToyBox();

        block.accept(box);

        box.cleanUpToys()
                .close();
    }

    private ToyBox open() {
        System.out.println("Open toy box :)");
        return this;
    }

    public ToyBox lego() {
        System.out.println("Play with lego!");
        return this;
    }

    public ToyBox meccano() {
        System.out.println("Play with meccano!");
        return this;
    }

    private ToyBox cleanUpToys() {
        System.out.println("Clean up toys :(");
        return this;
    }

    private void close() {
        System.out.println("Close toy box");
    }
}
