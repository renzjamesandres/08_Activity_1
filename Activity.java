public interface Carnivore {

    int pieces = 10;

    void eatGrass(); // making it to abstract method without a body

    default int chew() { // making it to default method
        return 13;
    }
}

//#2
interface HasWings { 
    int getNumberOfWings(); 
}

abstract class Insect implements HasWings { 
    abstract int getNumberOfLegs(); 
}

public class Dragonfly extends Insect {

    @Override
    public int getNumberOfWings() { // Implement method from HasWings
        return 4; // Method that the dragonfly has 4 wings
    }

    @Override
    int getNumberOfLegs() { 
        return 6; 
    }
}
