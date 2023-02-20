package HW6.AbstractClasses;

import HW6.Interfaces.Fly;

public abstract class FlyingBird extends Birds implements Fly{

    public final int flyHeight;

    protected FlyingBird(int height, int weight, String eyesColor,int flyHeight) {
        super(height, weight, eyesColor);
        this.flyHeight = flyHeight;
    }

    protected FlyingBird(int height, int weight, String eyesColor) {
        super(height, weight, eyesColor);
        this.flyHeight = 0;
    }

    @Override
    public String fly() {
        return String.format("I'm flying at %d meters\n", this.flyHeight);
    }


    
}
