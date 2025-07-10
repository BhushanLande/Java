
public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Create objects
        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        person1 = null;
        System.gc();
        new Person("Alice");
    }
}
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " object is being garbage collected.");
    }
}

