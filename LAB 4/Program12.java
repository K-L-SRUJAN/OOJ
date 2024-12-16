abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("i eat other animal meat.");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping.");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("I eat other herbiours .");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is sleeping.");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("I am herbivours and i eat grass.");
    }

    @Override
    void sleep() {
        System.out.println("I have to be alert while sleeping.");
    }
}

public class Program12 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();
        System.out.println("I am Lion");
        lion.eat();
        lion.sleep();
        System.out.println("I am tiger");
        tiger.eat();
        tiger.sleep();
        System.out.println("I am dear");
        deer.eat();
        deer.sleep();
    }
}
