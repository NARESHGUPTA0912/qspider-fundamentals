package polymorphism.colorProject;

class Black extends Color{
    int quantity;
    Black(int quantity){
        System.out.println("Black color of quantity "+ quantity +"litres is being created.");
        this.quantity = quantity;
    }

    @Override
    public void applyColor(){
        System.out.println("Black Color Applied.");
        System.out.println("You are really become ghost like shadow in Black.");
        System.out.println("You have look like a Batman in Black.");
        System.out.println("Its been a long black night.");
    }
}
