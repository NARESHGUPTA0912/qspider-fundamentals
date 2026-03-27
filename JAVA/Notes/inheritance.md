# Inheritance:
 -> When an object is created then it will have feature from parent class alongwith its own featues.
 -> Inheritance is uni-directional where child class will have feature from parent class, 
    But parent class have not any feature from child class.
 -> Parent will not be allowed to access for any feature of its child class.

 -> Parent-child relation created using super call stat. It can be: (i) implicit super call (ii) explicit super call.
 1) Implicit super call : If the super call stat. is added by compiler to created parent child relation then it is
    called implicit super call.
 2) Explicit super call : If the supercall stat. i written by prograamer then it is called exp. supercall stat.

 Note: In Imp. supercall only no arg. constructor of parent class is called but through explicit any constructor 
       of parent class can be called from child class constructor.  


# Super call stat. It is a constructor call which is used to connect or call parent class construcor from child class constructor to parent class constructor.
Syntax: super(var1, var2....).

# D/f B/w this call and super call:
1) this() is used to call constructor inside the same class but super() is used to call constructor of parent 
   class from child class constructor.
2) this keyword access current class non-static members and super keyword access parent class non-static members.

# D/f B/w Stack and Heap Area:
1) 

# Data Hiding
Data hiding is a procesess to declare data members of a class is private so that it will be not visible or acccessible from outside the class.
-> Public type getters and setters method are required to accessed the private data.
Ex -> class Employee{
   private int age;
   // getters + setters
}

Q-> Design encapsulated class for Product, Bank, FacebookUser.



