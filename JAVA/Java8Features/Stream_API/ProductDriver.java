package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Products {
    String brandName;
    int rating;

    public Products(String brandName, int rating) {
        this.brandName = brandName;
        this.rating = rating;
    }

    @Override
    public String toString(){
        return "Brand Name: " + brandName + " Product Rating: " + rating;
    }

    // @Override
    // public boolean equals(Object o){
    //     Products p = (Products)o;
    //     return this.rating == p.rating;
    // }

    // @Override
    // public int hashCode(){
    //     return Integer.hashCode(rating) ;
    // }

    // public int compareTo(Products p){
    //     return this.rating - p.rating;
    // }
    // public boolean hasRating(Products p){
    //     return p.rating == 1 || p.rating  == 5; 
    // }
}

public class ProductDriver{
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>(Arrays.asList(new Products("Shoes", 5),
                                                            new Products("Utensils",4),
                                                            new Products("Clothes", 2),
                                                            new Products("Bikes", 1)
                                            ));
        // fetch the lowest and highest rating of product and limit is 2
        List<Products> r = list.stream().filter((p) -> p.rating == 1 || p.rating == 5).collect(Collectors.toList());
        System.out.println(r);

        // List<Products> l = list.stream().map((pr))
    }
}