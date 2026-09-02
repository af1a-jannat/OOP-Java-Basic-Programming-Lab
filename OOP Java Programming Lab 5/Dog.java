class Dog {

    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog1.setName("Charlie");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);

        System.out.println();

        System.out.println("Dog 2:");
        System.out.println("Name: " + dog2.name);
        System.out.println("Breed: " + dog2.breed);
    }
}