package singletonclass;

public class Manager {
    
    String name;
    private static Manager m = null;

    private Manager(String name){
        this.name = name;
        System.out.println("Manager created!");
    }

    public static Manager getInstance(){
        if(m==null)
            m=new Manager("DB Manager");
        return m;
    }
}
