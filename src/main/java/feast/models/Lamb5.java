package feast.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lamb5 {
    private final Goat6 goat;

    public Lamb5(Goat6 goat) {
        this.goat = goat;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat.toString();
    }
}
