package CodeChallengePetShelter;

import java.util.ArrayList;

public class AnimalShelter {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    public void enqueue(Animal animal) {
        animals.add(animal);
    }

    public Animal dequeue(String pref) {
        Animal resultAnimal = new Animal("");
        for (Animal a:animals) {
            if (a.animalType.equals(pref)) {
                resultAnimal = a;
                animals.remove(a);
                break;
            }
        }
        return resultAnimal;
    }

    public void listAnimals() {
        for (Animal a:animals) {
            System.out.println(a.toString());
        }
        System.out.println("---");
    }
}
