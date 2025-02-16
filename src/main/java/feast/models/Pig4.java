package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pig4 {
    private final Lamb5 lamb;

    @Autowired
    public Pig4(Lamb5 lamb) {
        this.lamb = lamb;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a lamb, " + lamb.toString();
    }
}
