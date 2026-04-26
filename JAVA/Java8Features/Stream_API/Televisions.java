package Java8Features.Stream_API;

public class Televisions {

    int id;
    String color;
    double price;

    Televisions(int id, String color, double price) {
         this.id = id;
         this.color = color;
         this.price = price;
    }

    @Override
    public String toString() {
        return "TV-id: " + id + "Color: " + color + "Price: " + price;
    }

    // @Override
    // public boolean equals(Object o){
    //     Televisions t = (Televisions) o;
    //     return this.price == t.price;
    // }

    // @Override
    // public int hashCode(){
    //     return Double.hashCode(price);
    // }

}