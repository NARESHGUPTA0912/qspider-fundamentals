package Java8Features.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Program7 {
    Supplier <List> sup = ArrayList::new;

}
