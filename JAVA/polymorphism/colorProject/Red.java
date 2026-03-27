package polymorphism.colorProject;

class Red extends Color{
    int quantity;

    Red(int quantity){
        System.out.println("Red color of quantity "+ quantity +" litres is being created.");
        this.quantity = quantity;
    }

    @Override
    public void applyColor(){
        System.out.println("Red Color applied.");
        System.out.println("You look passionate and energetic in Red.");
        System.out.println("Red is the color of love and power.");
        System.out.println("You are shining like a Red Rose.");
    }   

    // public int getQuantity() {
    //     return quantity;
    // }

    // public void setQuantity(int quantity) {
    //     this.quantity = quantity;
    // }
}
