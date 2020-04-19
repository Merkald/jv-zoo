package core.basesyntax.zoo;

public final class Volier {
    private final int SIZE;
    private final VolierType type;

    public Volier(int size, VolierType type1) {
        this.SIZE = size;
        this.type = type1;
    }

    public int getSize() {
        return SIZE;
    }
}
