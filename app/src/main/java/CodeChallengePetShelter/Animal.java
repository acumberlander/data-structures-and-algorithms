package CodeChallengePetShelter;

public class Animal {
    String animalType;

    Animal(String _animalType) {
        this.animalType = _animalType;
    }

    @Override
    public String toString() {
        return animalType;
    }
}
