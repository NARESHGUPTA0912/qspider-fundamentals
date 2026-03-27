class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };
        dog.sound();
    }
}
