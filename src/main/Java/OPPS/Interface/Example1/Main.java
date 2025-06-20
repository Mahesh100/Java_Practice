package OPPS.Interface.Example1;

public class Main {
    public static void main(String [] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal lion= new Lion();

        AnimalSoundPrinter animalSoundPrinter = new AnimalSoundPrinter();

        animalSoundPrinter.printAnimalSound(dog);
        animalSoundPrinter.printAnimalSound(cat);
        animalSoundPrinter.printAnimalSound(lion);
    }
}
