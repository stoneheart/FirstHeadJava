class Cat {
    int size;
    String name;

    void meh() {
        if (size > 10) {
            System.out.println("Meh-Meh!");
        } else {
            System.out.println("Meeeeeh");
        }
    } 
}

class Owner {
    String name;

    void catIsFatter(Cat c) {
        c.size = 20;
        System.out.println(name + " owns the cat");
        System.out.print(c.name + " is a cat: ");
        c.meh();
    }
}

class CatTestDrive {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.size = 8;
        one.name = "Ketty";
        System.out.print(one.name + " is a cat: ");
        one.meh();
        
        Owner catOwner = new Owner();
        catOwner.name = "Hulu";
        catOwner.catIsFatter(one);

        System.out.println(one.name + " is fatter because of " + catOwner.name);
        System.out.print(one.name + " is a cat: ");
        one.meh();
    }
}
