class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}
