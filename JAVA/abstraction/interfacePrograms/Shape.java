package abstraction.interfacePrograms;

public interface Shape {
    void rotate();
    default void test(){
        System.out.println("Default Method");
    }
}
