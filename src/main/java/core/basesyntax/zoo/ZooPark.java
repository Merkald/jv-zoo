package core.basesyntax.zoo;

import core.basesyntax.animals.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooPark {
    private List<Volier> voliers;
    private List<CompositionOfFeed> ambars;
    private List<? extends Zoo> animals;

    public ZooPark() {
        voliers = new ArrayList<>();
        ambars = new ArrayList<>();
        animals = new ArrayList<>();
    }

    public void addVolier(Volier volier) {
        voliers.add(volier);
    }
    public void addAmbar(CompositionOfFeed ambar) {
        ambars.add(ambar);
    }
}
