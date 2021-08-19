/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CodeChallengePetShelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void enqueueAddsAnimal() {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal("dog"));
        animalShelter.enqueue(new Animal("cat"));
        animalShelter.enqueue(new Animal("lizard"));

        assertEquals(animalShelter.animals.size(), 3, "There should be 3 objects in the collection.");
    }
}
