package EuropeanParrot;

import parrot.Parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        //
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
