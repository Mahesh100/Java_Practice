package SOLID.Liskov;

 class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

     public static void main(String[] args) {
         Animal d = new Dog();
         d.eat();

     }

 }
    class Dog extends Animal
    {
        void eat()
        {
            System.out.println("Dog is eating");

        }
    }


