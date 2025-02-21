package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chicken3 {
    private Pig4 pig;

    @Autowired
    public void setPig(Pig4 pig) {
        this.pig = pig;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a pig, " + pig.toString();
    }
}

