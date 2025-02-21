package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lamb5 {
    private Goat6 goat;

    @Autowired
    public void setGoat(Goat6 goat) {
        this.goat = goat;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat.toString();
    }
}
