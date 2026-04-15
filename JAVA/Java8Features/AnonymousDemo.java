package Java8Features;

public class AnonymousDemo {
    
    public static void main(String[] args) {

        // Act implemented using anonymous class
        Act act = new Act() {
            @Override
            public void print(Writeable w) {
                w.write("This is a sample text");
            }
        };

        // Student as Writeable (anonymous class)
        Writeable student = new Writeable() {
            @Override
            public void write(String s) {
                System.out.println("Student writes: " + s);
            }
        };

        // Author as Writeable (anonymous class)
        Writeable author = new Writeable() {
            @Override
            public void write(String s) {
                System.out.println("Author writes: " + s);
            }
        };

        // Calling
        act.print(student);
        act.print(author);
    }

}
