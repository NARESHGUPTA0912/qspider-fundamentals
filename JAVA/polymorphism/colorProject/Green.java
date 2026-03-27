package polymorphism.colorProject;

class Green extends Color{
    int quantity;

    Green(int quantity){
        System.out.println("Green color of quantity "+ quantity +" litres is being created.");
        this.quantity = quantity;
    }

    @Override
    public void applyColor(){
        System.out.println("Green Color applied.");
        System.out.println("You are one with Nature in Green.");
        System.out.println("You are looking fresh and energetic in Green.");
        System.out.println("Go Green to save the Earth.");
    }
}
