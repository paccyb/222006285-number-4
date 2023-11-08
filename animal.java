class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void run() {
        System.out.println("mammal is running.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println( "bird is flying.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("dog is barking.");
    }
}

class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("parrot is talking.");
    }
}

class Animaldemo{
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.run();
        dog.bark();

        System.out.println();

        Parrot parrot = new Parrot("Polly");
        parrot.eat();
        parrot.sleep();
        parrot.fly();
        parrot.talk();

         System.out.println();

        Mammal mammal= new Mammal("elephant");
        mammal.eat();
        mammal.sleep();
        mammal.run();
        
    }
}
