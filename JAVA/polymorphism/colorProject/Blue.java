package polymorphism.colorProject;

class Blue extends Color{
    int quantity;
    Blue(int quantity){
        System.out.println("Blue color of quantity "+ quantity +" litres is being created.");
        this.quantity = quantity;
    }

    @Override
    public void applyColor(){
        System.out.println("Blue Color applied.");
        System.out.println("Hahahah.... You have become BLUE BLEWwww...");
        System.out.println("You have become blue like the SKY.");
        System.out.println("You are looking damn cool in Blue.");
    }
}
