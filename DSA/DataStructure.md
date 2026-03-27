# Do While Loop : It is exit control loop where first loop body executes and then condition is checked at exit point.

Permutations of String,    palindrome string
substring - Largest Non-repeating substring, largest palindromic string
Reverse - 1. reverse full 2. reverse each word 3. reverse substring



<!-- 14/02/26 -->
# Time & Complexity: It is the analysis for an algorithm to understand in how much time or in space the given problem will be solved.

Symbols :-
O => Big O ==> Upper Bound(Max time/space)
0  => Theta ==> Tight Bound
_n_  => Omega ==> Lower Bower(Min time/space)

- For an Algorithm in analysis O is used which gives guarantee in time and space the problem will be solved definitely. 

Functions:
1) Constant F: O(1)
2) Linear F: O(n)
3) Exponential F: O(n*n)


<!-- 21/2/26 -->
# String: It is a sequence of characters.
Ex -> "abcd";
# There are three ways to created a String:
 1) String(C)           2) StringBuilder(C)           3) StringBuffer(C)

 # String(C): It is a class which is used to create String type of objects.
 *Important Features:*
 1) String is an object which will have string value alongwith all the methods of String.
    Ex -> String s = "Mohan";
 2) String is an Immutable type object. Once it is created then it cannot be modified. If we try to modify it then new string will be created.
    Ex -> String s = "mohan";   // s is refer to mohan
          s = "rohan";       //now s is refer to rohan (new string is created) and mohan is garbage collected
 3) String can be created by using String class in 3 ways:
    i) By using String Literals
   ii) By using new Keyword
  iii) By using char sequence

  # a) String creation by using String Literals:
      - If String object is created by using Literals then it is created inside a special area called String Constant Pool(SCP).
      - Ex -> String s = "mohan";

  # b) String creation by using new Keyword:
     - When string object is created by using new Keyword then two objects are created one in SCP and One ine Heap.
     - In this case the String from Heap will be returned on reference.
        Ex -> String s = new String("John");

  # c) String creation by using char sequence:
     - 

4) String Constant Pool(SCP): 
- It is a special memory area inside heap area which is used to create String objects using String Literals.
- SCP can have only unique type Strings.
- In SCP One string object can have multiple reference, in case similar objects are created multiple times.
- Garbage Collected is not allowed inside SCP.

5) '==' and equals():
i) == : It is used to compare reference of two objects if afterr comparison it is true then they are the same object otherwise they are the different objects.
ii) equals(): It is used to compare the internal details of two String. If internal details are same then it will be true otherwise it will be false.

6) If Literals are in concatenation process then string is created inside SCP but if reference are used for Concatenation then String will be created inside in Heap Area.
Ex -> String s1 = "Mo"+"han"; // in SCP
      String s2 = "Mo";  // in scp
      String s3 = s2 + "han"(in scp) ;  // in heap

7) If a method is called on String and the result is different String then the resultant String will be created in heap.
8) If a method called and the result remains same as per the string then the same string will be returned.
9) intern(): It returns the String from SCP. If String is already available in SCP then same object will be returned otherwise new object will be created inside SCP then it will be returned.

# StringBuilder And StringBuffer are used to create mutable type of Strings.
- StringBuilder is not synchronized but StringBuffer is synchronized.

# Difference Between String, StringBuilder And StringBuffer:
- String:
    - immutable
    - it is since java 1.0
    - It is Not synchronized.
    - It is thread-safe.
    - Slow in Performance
- StringBuilder
    - mutable
    - it is since java 1.5
    - It is Not synchronized.
    - It is not thread-safe.
    - Very fast in Performance

- StringBuffer
    - mutable
    - it is since java 1.0
    - It is synchronized.
    - It is thread-safe
    - Very slow in Performance

# Why String is Immutable ?
- String objects are shared from SCP. Sharing feature with multiple reference can be achieved only if String will be Immutable.
- So to support sharing of string it is made Immutable.
------------------------------------------------------------------------------------------------------------------------
<!-- 26 mar -->
# LinkedList: 
-> It is a Linear DS which stores the value and reference in the form of node.
-> Types of LinkedList:
        i) Singly LinkedList
       ii) Doubly LinkedList
      iii) Circular LinkedList

# Singly LinkedList:
-> Singly LinkedList is a DS which uses a node that contains value alongwith reference for the next node.
-> Structure:
            Node@...
             ___________________
            | int val = 10;     |
            | ----------------- |
            | Node next = null; |
            `````````````````````
Note: First we have to hold the next address before leaving it.

Singly Linked Node:
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}