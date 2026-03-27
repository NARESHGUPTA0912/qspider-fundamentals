package Others;
class Product{
    String name;
    double price;
    String brand;

    public Product(String name,double price,String brand) {
        this.name=name;
        this.price=price;
        this.brand=brand;
    }
    // this method belongs to object class when object print its automatically call
    @Override
    public String toString(){
        return name+" "+price+" "+" "+brand;
    }
    public static void main(String[] args) {
        Product p1=new Product("Laptop",45000,"Dell");
        System.out.println(p1);
    }
}

