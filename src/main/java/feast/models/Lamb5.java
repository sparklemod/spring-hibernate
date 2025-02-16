package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lamb5 {
    private final Goat6 goat;

    @Autowired
    public Lamb5(Goat6 goat) {
        this.goat = goat;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat.toString();
    }
}
