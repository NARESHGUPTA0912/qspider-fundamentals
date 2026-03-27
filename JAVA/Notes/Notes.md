<!-- ----- 17 Jan ----- -->
# Collection Framework:
* It is a group of interfaces and classes which are used to store a group of objects and perform CRUD operatiobs efficiently.

# D/F B/W Array and collection Framework
- Array :
-> It is Fixed in Size.
-> It is not good in memory mgmt.
-> Array doesn't have support of inbuilt methods.
-> It Stores only similar(Homogeneous) types of elements.
-> We Can store prim. or non-prim data into array.
-> Array provides fast performance.

- CF:
-> It provides d/f ds tha can grow or shrink as per requirement.
-> It provides better memory mgmt.
-> Collecction has large amount of support of inbilt methods.
-> It can store heterogeneous types of elements.
-> we can store only non-ptim.type or object type data into collection framework.
-> It is slightly slower than array.

* To overcome the limitations of array java provide Collection Framework inside java.util package.
* CF work was introduced in java 1.2 version. It contains two d/f hierarchy: 
  i) Collection Hierarchy : It is a group of many interfaces and classes which are used to store group of objects. 
    - The Topmost interface here is Collection Interface.
    - It has 3 main childs - i) List ii) Set iii) Queue
  ii)Map Hierarchy

# Collection Interface:
- It is the topmost interface of collection hierarchy. it provides some methods to perform basic crud operations such as: add, remove, search etc. It methods are available all its child such as: List, set and queue.
- Collection doesn't provide indexing so we cannot add, remove or search element by using indexing through collection reference.

# List Interface:
- It is the child interface of collectiin interface.
* Features of List:
-> We can add duplicates in List.
-> It provides indexing so elements can be added, removed or searched while using indexing. 
-> It  provides get(index) method by which we can access the element of List from different index.
-> It maintains insertion order of the elements so element will be accessed in the same order in which it was added.
-> We can add multiple null elements in list.
- All of the above mention features will be available to every child of list such as: ArrayList, LinkedList, Vector and Stack.

# Set: 
- It is the child interface of Collection interface:
* Features of Set:
-> Duplicates are not allowed in a set.It contains a group of unique elements.
-> It doesn't provide indexing so we cannot add, remove or search the element by using indexing.
-> We can store only one null elements in set.
-> Set may or may not maintain the insertion order of the elemets.
- All the Above mentions general features of set will be available to every child of Set such as: HashSet, LinkedHashSet, and TreeSet.

# D/F B/W List and Set:
- List:
-> Duplicates are allowed.
-> List have indexing
-> Insertion ordered is maintained
-> Multiiple null elements  can be added.

- Set:
-> Duplicates are not allowed.
-> Set doesn't have indexing
-> Insertion ordered is not maintained
-> Multiiple null elements  cannot be added, maximum one null element can be added.

# Queue:
- It is the interface which extends Collection Interface.
* Feautures :
-> The main feature of Queue is First-in First-out (FIFI) mechanism.
-> Queue uses a linear DS where element is always add() from tail and remove() from head in FIFO mechanism.
   Ex-> -------------------------
        |18 | 12 | 32 | 43 | 10 |
        -------------------------
        
-> Duplicated can be added.
-> Indexing is not available in queue.
-> We cannot store any null element in queue.
-> Insertion order is maintain in most of the queue but not maintained in priority queue.

# DeQue : 
- It is an interface which extends queue interface. It is a doubly ended queue which provides features of queue applicable from both ends of the queue, We can perform queue operation from any side of the queue.

<!-- 31-jan-2026 -->
# ArrayList: It is a class which implements list interface of collection framework
- Important points about Arraylist:
        1) Arraylist internally uses dynamic array as the internal implementation of data structure which can grow or shrink as per requirements.
        2) In arraylist elements are store in continuous block of memory.
        3) When arraylist is created then it is created with default capacity 10. When capacity will be full then new arrylist will be created internally with 50% bigger in capacity.
        4) arraylist provides very fast random access of elements because it has indexing and implements an interface RandomAccess for fast access.
        5) Arraylist is slow in modification (Insertion or Deletion ) becau(se if element is added or removed in middle then all the other elemnts will have to  shift left or right side of the array. 
        6) Arraylist is recommended to use if application requires frequent access but few modifications.
        7 Arraylist is not synchronized but if synchronization is required then we can synchronized it by calling method synchronized list of Collections class.
                -> Ex - Collections.synchronizedList(l1) // l1 is object
        8) Time complexity for basic operations: 
                -> add(index) - O(n), -> remove(index) - O(n),  -> contains(object) - O(n)
                -> get(index) - O(1)  -> set(index) - O(1).

<!-- 07-02-26 --> ArrayList Project

<!-- 14-02-26 -->
# LinkedList:  It implements List as well as Deque interface of Collection Framework.'{"?>"""""""""""""""""""""">""""""""""""""""""""""""""""""""""""""""""""""""""""}

- *Features of LinkedList :*
        1) LinkedList uses doubly linked node as the internal implementation of data structure. 
        2) A node is a memory block where value is stored alongwith next node address and previous node address.
        3) In double linked node we can traverse in forward as well as in backward direction .
        4) LinkedList provides fast modification(Insertion, Deletion) .
        5) LinkedList provides slow traverse because we have to move each node using next address and previous address.
        6) LinkedList is not synchronised but we can sychronized it by using Collection class method .
        7) In LinkedList basic operations such as add(), or remove() is performed in O(1) time (Constant time) but in access or in search it takes O(n) times.
        8) LinkedList is recommended to use if application has more modification operation but less search or access operation.

- *Difference between ArrayList and LinkedList*

 ArrayList: 
 1) It implements List(I).
 2) It internally uses dynamic array as the implementation of data structure.
 3) It uses less memory to store one value.
 4) It provides fast random access.
 5) It is slow in modification .
 6) It is recommended for access operations.

 LinkedList:  
 1) It implements List(I) as well as Deque(I).
 2) It uses DoublyLinkednodeas the implementation of data structure.
 3) It uses more memory to store one value because address is also stored alongwith value.
 4) It is slow in access because we have to traverse each node one by one.
 5) It is fast in modification .
 6) It is recommended for fast modification operations.

 # Vector: It is Class which implements List(I).

 *Features of Vector:*
1) Vector is very similar as ArrayList but the main difference is Vector is sychronized but ArrayList is not synchronized.
2) Vector uses dynamic array as the internal implementation of data structure.
3) Vector is synchronized so it provides slow performance in multi-threaded environment.
4) Vector provides thread safety in multithreaded environment.
5) It is a Legacy class which is available since java 1.0 version.
6) Vector is outdated and it is only used with in legacy projects. 
7) It is recommended to use ArrayList or LinkedList instead of Vector by making ArrayList or LinkedList Synchronized.

Note: peek(): This method is used to access the top element from Collection without removing it.
      poll(): This method is used to access and remove the topmost element from the Collection.

# Stack: It is a Class which extends Vector(C) of Java.
 *Features Of Stack:*
 1) It uses Linear Data Structure to store a group of objects
 2) The main feature of stack is Last-In-First-Out which is achieved through push() and pop() method.
 3) Stack has a method contains(Object obj) which is used to search the object.
 4) It is a Legacy Class which is available since Java 1.0 update.
        ex -> Stack<Integer> s1 = new Stack<>();
        System.out.println(s1.contains(obj));

# HashSet: HashSet is a class which implements Set(I).

 *Features of HashSet:*
 1) It does not maintain insertion order of elements.
 2) We can add maximum one null element in HashSet.
 3) In HashSet, Hashing mechanism is used to store the elements on a table Called HashTable.
 4) Initial capacity of Table will be 16 and load factor will be 75%.
 5) Incase of Collision, Red-Black Tree is used to avoid the Collision.
 6) HashSet provides very fast Search Operation.
 7) It is not Synchronized but we can synchronize it by using Collections(C) class method.

 # LinkedHashSet: It is class which extends HashSet(C) and implements Set(I).

 *Features of LinkedHashSet:*
 1) It maintains internal order of the elements.
 2) We can add one null elements into LinkedHashSet.
 3) It uses hashing mechanism along with LinkedList implementstion to maintain insertion order.
 4) It provides fast search but slightly slower than HashSet.
 5) It is not synchronized but we can synchronize it by using Collections class.

hashCode(): public abstract int hashCode()
Returns the hash code value for this set. The hash code of a set is defined to be the sum of the hash codes of the elements in the set, where the hash code of a null element is defined to be zero. This ensures that s1.equals(s2) implies that s1.hashCode()==s2.hashCode() for any two sets s1 and s2, as required by the general contract of Object.hashCode.

# TreeSet: It is a Class of Set Hierarchy.

*Features of TreeSet:*
 1) It stores the element in Sorted order.
 2) Default Sorting mechanism will be natural order will be ascending order. We can change the order by using appropriate Comparator.
 3) All elements in TreeSet(C) must be of same type.
 4) null element can not be added in TreeSet.
 5) TreeSet internally uses Red-Black Tree to store the group of objects.
 6) It provides fast Insertion, Deletion, Search Operations in O(logn) time.

# PriorityQueue: It is a class which implements Queue(I).

*Features of PriorityQueue:*
1) It does not maintain Insertion Order.
2) In PriorityQueue Min-Heap is used to store the elements where the smallest value will have highest priority and it will be on head(top).
3) We can change the priority in PriorityQueue by using Comparator.
4) We cannot store null in PriorityQueue.


# Lambda Expression:

<!-- 21/02/26  -->
# Map: It is a Data Structure which is used to store Key-Value Pair. Key & Value both are object in Map.
- Keys must be unique but values can be same.
- One key will map only one unique value. 
- Key and value pair is called Entry and it is represented as Map.Entry .
Ex -> Map<Integer, String> m = {[16 "Mohan"] [] [ ] [] [ ] }

# Map Hierarchy:

# HashMap(C): It is a class which implements Map(I) of Map Hierarchy.
*Properties:*
1) Insertion order of Entries will not be maintained.
2) It uses Hashing mechanism to store the elements on a table called Hashtable.
3) HashMap provides very fast search, add, or remove operations because of Hashing mechanism.
4) In Ideal Case:
        Search: O(time) = O(1)
        ADD   : O(time) = O(1)
        Remove: O(time) = O(1)
   In Worst Case:
                O(time) = O(log n)

5) In HashMap One null key and multiple null values are added or allowed.
6) It is not synchronized but it can be sychronized by using Collections class method.
7) It is recommended to use when very fast search is required but insertion order does not matter.
8) It uses equals() to check whether two keys are same or not on Hashtable.
9) Incase of collission on hashtable Red-Black Tree is used to avoid the Collission.
Note: null hashcode always generated as 0 in Hashtable.

# LinkedHashmap(C): It is a class which extends HashMAp(C) and implements Map(I).
*Properties:*
1) It maintains Insertion Order of the elements.
2) It uses hashing mechanism alongwith LinkedList implementation to maintain the Insertion order.
3) It provides fast Search, Insertion, Deletion but slower than HashMap.
4) One null key and multiple null values can be added.
5) It also uses equals() to compare two keys are same or not.
6) It is not synchronized but it can be sychronized by using Collections class .
7) It is recommended to use when fast Search is required alongwith maintained Insertion order.

# IdentityHashMap(C): It is a class which implemets Map(I).
*Properties:*
1) Insertion order will not be maintained.
2) It uses '==' operator to check two keys are same or not.
3) It is used to track Object because if Objects are different then it will be added in IdentityHashMap.
4) It provides fast Search, Insertion or Deletion
5) It allows One null key and multiple null values.
6) It is recommended to use when the main requirement of application is Object tracking.
7) IdentityHashMap is not thread-safe.

# Hashtable: It is a class that implements Map(I) but now it is outdated.
- It is thread-safe.


<!-- // 28/2/26 -->

# Loops on Collection Hierarchy:
1) for loop // limited use
2) for each loop // limited use
3) forEach() method [java8 feature]
4) Iterator cursor  \\best
5) ListIterator cursor \\ and recommended

1) forloop -> It can be use with list hierarchy bcz its required indexing to access the element.
ex-> 
      List<Integer> l = new ArrayList();
         // l -> 10,18,17,15,30,35

      1) // Access Each elements
      for(int i=0; i<l.size(); i++){
            sop(l.get(i));
      }
     

      2) //sum of each elements:
      int sum=0;
      for(int i=0; i<l.size(); i++){
            sum += l.get(i);
      }sop(sum);

      3) // remove even number
      for(int i=0; i<l.size(); i++){
            if(l.get(i) % 2 == 0){
                  l.remove(i);
                  i--;
            }sop(l);
      }
_Limitation_      :      we can only use for loop for access, update, remove element from List. It is not works on Set.

2) for each loop: It internally uses a _cursor_ which does not allow any modification in the structure of Collection. 
        -> If operation such as add(), remove() is applied inside for Each loop then immediately it stops the execution and throws ConccurentModificationsException.  
        -> It internally uses _modCount_ to detect any structural changes.
      syntax: for(dataType varName: Collection/Array reference){
            // code
      }
      Ex ->
      1) // Access Each elements
      for(int n: l){
            sop(n);
      }

      2) //sum of each elements:
      int sum=0;
      for(int n: l){
            sum += n;
      }sop(sum);

      3) // update value
      int i=0;
      for(int n: l){
            if(n % 2 == 0){
                  l.set(i, n*2);
            }i++;
      }
      sop(l);

      4) // remove even number
      for(int i=0; i<l.size(); i++){
            if(l.get(i) % 2 == 0){
                  l.remove(i);
                  i--;
            }sop(l);
      } // here exception occured

*Limitation: * If we want to change/modify the Collections size then it occured the ConcurrentModificationException. Its not an limitation , its a good practice.
\\ solution for this situation is use CopyOnWriteArrayList (other way also exist)

_Fail Fast_: It is a mechanism which doesn`t allow any modification on underlying data structure at the time of iteration. 
             If any modification is detected while forEach loop/Iterator is running then it throws ConcuurentModificationsException which is called _FailFast_ mechanism.
             The _cursors_ of ArrayList, LinkedList, HashSet etc have _FailFast_ type cursor.

_Fail Safe_: It is a mechanism by which modification in a structure is allowed at the time of Iteration.
             In FailSafe mechanism, modification is perform on copy of Collection not an Original Collection.
             CopyOnWriteArrayList, ConcurrentHashMap etc provides _failSafe_ type cursor.

 * CopyOnWriteArrayList:   A thread-safe variant of {@link java.util.ArrayList} in which all mutative
 * operations ({@code add}, {@code set}, and so on) are implemented by making a fresh copy of the underlying array.
 * <p>This is ordinarily too costly, but may be <em>more</em> efficient than alternatives when traversal operations vastly outnumber
 * mutations, and is useful when you cannot or don't want to synchronize traversals, yet need to preclude interference among
 * concurrent threads.  The "snapshot" style iterator method uses a reference to the state of the array at the point that the iterator
 * was created. This array never changes during the lifetime of the iterator, so interference is impossible and the iterator is
 * guaranteed not to throw {@code ConcurrentModificationException}.
 * The iterator will not reflect additions, removals, or changes to the list since the iterator was created.  Element-changing
 * operations on iterators themselves ({@code remove}, {@code set}, and {@code add}) are not supported. These methods throw {@code UnsupportedOperationException}.

ex -> 1) // remove even number
      for(Integer n: l){
            if(n % 2 == 0){
                  l.remove(n);
            }sop(l);
      } 
// checkForCoModification(): It is a method whichis working on behind the scene of forEach loop, forEach(), to check Concurrent Modification.

3) forEach(): This is a Java 8 feature which was introduced to be used with Lambda Expression.
        Ex-> 
        List<Integer> l = new ArrayList();
         // l -> 10,18,17,15,30,35
         Sop("All numbers are: ");
         l.forEach(n-> Sop(n*2+"  "));

         Sop("\nAll Even numbers are: ");
         l.forEach(n -> {
                if(n % 2 == 0) {
                        Systen.out.print(n + " ");
                }
         });

4) Iterator cursor: Iterator cursor(^) is a universal cursor which is used to iterate anywhere in _Collection Framework_ .
        -> By using this cursor we can traverse each element one by one. It is created by iterator() method. cursor Object is created always at the start of Collection and by using methods hasNext(), next(), and remove() , we can iterate or remove the element.
        Ex -> 
        List<Integer> l = new ArrayList();
         // l -> 10,18,17,15,30,35
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()){
                int n = itr.next();
                if(n%2==0){
                        itr.remove();
                }
        }


5) ListIterator : It is a cursor which is used in List Hierarchy to iterate elemenst One by One. It is created by using method listIterator() on List type Collection.
                  It provides d/f methods to traverse and modify the collection such as: hasNext(), next(), hasPrevious(), previous(), nextIndex(), previousIndex(), set(), add(), remove() .

        Ex -> ListIterator<Integer> lit = l.listIterator();
                while(lit.hasNext()){
                sop(lit.next());
                }
                while(lit.hasPrevious){
                        sop(lit.previous());
                }

# D/F B/W Iterator and  ListIterator:
_Iterator_ :
        1) This is universal cursor bcz it is applicable everywhere.
        2) It can traverse only in forward direction.
        3) It always start from starting of the collection.
        4) Only remove() method is available for modification.

_ListIterator_ :
        1) It is not universal cursor bcz it is applicable only on List.
        2) It can traverse in forward as well as in backend direction.
        3) It can be started from any index.
        4) remove(), set(), add() are available for modification.

Note: echo.> (cmd)
   -> javap -c

   -> Behind the scene of forEach loop , it uses List iterator(), Iterator hasNext(), next() methods inside loop which is shows in program compiled class files.

# Loop On Map Hierarchy: 
        1) using KeySet() -> behind the scene: i) forEach loop  ii) iterator()
                Ex -> 
                Map<Integer> m = new LinkedHashMap<>();
                m.put(12,"abc);         m.put(11,"nje");         m.put(18,"acx");         m.put(16,"pqr");
                System.out.println(m.toString());
                Set<Integer> keys = m.keySet();
                <!-- for(int key: keys){
                        sop(keys+" "m.get(key));
                } -->
                Iterator<Integer> itr = keys.iterator();
                while(itr.hasNext()) {
                        int key = itr.next();
                        sop(keys+" "m.get(key));
                }

        2) using entrySet() -> behind the scene: i) forEach loop  ii) iterator()
                Ex -> 
                Map<Integer> m = new LinkedHashMap<>();
                m.put(12,"abc);         m.put(11,"nje");         m.put(18,"acx");         m.put(16,"pqr");
                Sop(m.toString());
                Set<Map.Entry<Integer, String>> entries = m.entrySet();
                <!-- for(Map.Entry<Integer>, String e: entries){
                        sop(e.getKey() + "\t" + e.getValue());
                } -->
                Iterator<Map.Entry<Integer>, String>> itr = entries.iterator();
                while(itr.hasNext()){
                        Map.Entry<Integer, String> ent = itr.next();
                        Sop(e.getKey() + "\t" + e.getValue());
                }

        3) forEach() Method:
                Ex ->
                Map<Integer> m = new LinkedHashMap<>();
                m.put(12,"abc);         m.put(11,"nje");         m.put(18,"acx");         m.put(16,"pqr");
                m.forEach((k,v)->System.out.println(k+"\t"+v));

# Object Class:
- It is the Supermost parent class of every class in java.It is in java.lang Package and it contains 11 methods which is by default available to every class in java.
(1) toString() -> It is the method of object class method which provides string representation of the object.
                  It is recommended that every class overrides toString() to get the details about the object created. 
<!-- 14/3/26 -->
2) getClass()
3) equals(obj)
4) hashCode()
5) clone()
6) finalize()


- These five methods are used in multithreadded programming for Inter-Thread communication.
7) notify()
8) notifyAll()
9) wait(long ms)
10) wait(int ms)
11) wait(long ms, int ms);

# Package : It is a physical folder which contains similar types of files.
Advantages: 
1) Package provides better organization for similar types of files at one location.
2) Package avoids Naming conflict problem.
3) Package provides better management which helps to scale up application easily.
4) Package helps to control access of different types of memn=bers for which java provides Access Modifiers.

# Types of Package:
1) Inbuilt Packages 
- Packages which are pre-defined inside JDK are called pre-defined/Inbuilt packages.
- java.util, java.io, java.sql, java.lang, java.math, java.net

2) 2) User-defined package: 
- A package that is created by a user is called user-defined package. 
- A package is creating bu using package keyword and we can use details of one package inside another package by using import keyword. 
- The package name is recommended to be in lowercase letters.
- Naming Convention:    keyword-domain-client-module-submodule-file
- Example - >           package com.wipro.icici.loan.homeLoan.ROI
- command to compile: javac -d . ROI.java       (package will be created in same folder).
- Or javac -d . fully Qualifiedname ROI.java
- command to run : java com.wipro.icici.loan.homeLoan.ROI

# Access modifiers: They are used to control or restrict the acccess of difefrent types of mathos. in java ther  \ ere 


<!-- ----- 21 Jan ----- -->
# MultiThreading : 
- Concurrency : When multiple processes run on a single core CPU is known as concurrency.
- Parallelism : When multiple processes runs on a multicore processor then it is called parallelism.
- Process : An Independent program under execution called process. it will have its own memory space and system resource.
        Ex -> 1) Browser 2) MS Excel 3) VLC .
- Thread : The smallest sub-process or a task that executes inside a process is called thread.
            Inside a process Multiple Thread runs to complete the process.
            Ex -> Inside Browser(download, upload, save, stream, search etc are called threads).
            Inside JVM(object creation, Memory Mgmt., Garbage Collection, etc are handled by a d/f threads).

Note : At OS Level, Multiprocessing happens because multiple process runs independently on CPU.
       At Language Level, Multithreading is required because there will be multiple threads inside a process.

# MultiThreading : When Multiple Thread or Sub-Process runs together complete a task or process then it is called MultiThreading.
        Ex -> At a booking Application We have options like -BookSeat 2)Pay 3)Decrease No. of Seats etc types options are called threads.
              While using any streaming platform all the users are also threads .

# D/F ways to create a thread:
1) By using Thread Class
2) By using Runnable Interface

<!-- ------ 22 Jan ----- -->
# Steps to creating thread using Thread class:
1) Extend our class by Thread class.
2) We have to override run method from where thread is executed.
3) we have to create object of our class which will be a thread object.
4) we have to start thread by calling start() of thread.

start() : this method internally calls run() to execute all the different threads.

Q) What will happen if we directly call run() ?
sol-> If run() is directly call then execution will be like a normal object in a sequence.

<!------ 23 Jan ----->
# Steps to creating thread using Runnable Interface:
-> We have to implements runnable interface in our class.
-> We have to ovverride the run() method in our class
-> we have to pass object of our class to thread constructor which creates thread.
-> We have to call start() for thread execution which internally calls run().

Note: Thread creation by using Runnable Interface is preferred because we can take advantage of Multiple Inheritance using Runnable Interface.

# Types of Thread:
Thread is of types: 1) User thread              2) Daemon Thread

1) User Thread : A thread is created by user is called user thread. 
        It is a high priority thread which must complete terminates.
        Application cannot terminate before all user thread will complete execution.
        We can convert a user thread in a daemon thread by calling method setDaemon(true); 

2) Daemon Thread: They are low priority threads which runs in background. 
        It is a low priority thread for which JVM wil not wait to finish its execution. 
        Daemon threads are used to support all the other threads by running in background.
It helps to perform background task such as:
-> Signal Processing
-> Memory Management
-> Garbage Collection
-> System Resource Management etc.

# Thread execution memory model:
When start() is called on thread then thread enters into runnable area and when a thread gets CPU time then it executes from run() method.
A thread executes for a small time duration and then another thread can get CPU time from parallel execution. 
When all user thread will complete execution then application will terminate.

<!-- 27-01-2026 -->
# Thread Lifecycle:
1. New State : When thread is created then it is called New State of the  Thread.
2. RUNNABLE state:When start() is called on a thread then it enters into RUNNABLE state. In this state Thread is either waiting for CPU time or it is running. In runnable state thread is ready to run at any moment.
3. RUNNING state : When thread gets cpu time then thread will be running.
4. TimedWaiting / Waiting and Blocked State: If wait(), sleep() or join() method will be called in running state then thread will be in wait and blocked state.
5. Terminated State : When thread is completely executed or stop() is called on Thread then it will be terminated.

# Important Points:
1> main thread is the parent thread of every thread. All the other threads that are created from main method is called child threads.
2> Execution always start from main thread and all other thread starts after that.
3> A threads start by calling Start() on thread. a thread can be started only once. if it is started multiple times then it will throw IllgalThreadStateException.
4> Every thread will have thread name(which is givens as Thread0, Thread1 etc). We can change the name by calling setName{(String):void} of thread.
5> Every thread will have ThreadId and we can get it by calling method getId().
6> Thread Scheduler is a component which decides which thread will get cpu time in which order thread will execute. It decides execution on various factors such as thread priority: 1) FCFS, 2) Various algorithm as per requirements.
7> Every thread will have priority from 0-10. 0 is the least priority and 10 is the highest. We can change priority of a thread by setPriority()[it is the suggestion for thread scheduler]. Average Priority of thread is 5.


<!-- 29-1-26 -->
# Synchronization : It is a technique by which only one thread will be allowed to access and use the shared resource at a time. When a thread is using the resource then other thread will have to be in wait().
# Assynchronization : If multiple thread can be access the same shared resource at the same time.

-> Synchronization is achieved in two ways :
1) Synchronization method 2) Synchronized Block

1) Synchronized Method: If a method is declared by using synchronized keyword then such method is called synchronize method. ex -> public synchrozed void increment(){count++;};

Dissadvantages of Synchronize Method:
-> In synchronized method complete method will be locked for other thread which will decrease the overall performance.

2) Synchronized Block: If a block is declared by using synchronized keyword then such block is called synchronized block.
        When a thread is enter into synchronized block then a lock is generated for other threads.
Advantage of Synchronized block:
-> Incase of synchronized block only the section of the code is locked. In this way performance will improve because other section of the code is free from lock.
ex-> 1) class Counter {int count=0;public void increment(){// code synchronized (this){count++;} // code} // object level synchronization}
     2) class Counter {int count=0;public void increment(){// code synchronized (Counter.class){count++;} // code} // class level synchronization}
 
- Important Points about Synchronization:
        1) At a time only one thread will be allowed to access the resource.
        2) Synchronization will decrease the overall performance.
        3) Synchronization helps to achieve thread safety.
By the above points it is recommended to use synchronization in multithreading environment where resource is modified and we need thread safety and consistent behavior.

Advance Topics:
        -> AtomicInteger
        -> Lock/Reentrant lock
        -> ThreadLocal(Advance Java).
        -> Deadlock
        -> Ways to avoid deadlocks
        -> Interthread Communication(wait(),notify(),notifyAll())
        -> Producer-Consumer Problem(Imp) , Parking Lot Problem
        -> Virtual Thread
        -> Thread Pool(Imp)
        -> Advantage of MultiThreading

<!-- 30-1-26 -->
# AtomicInteger: It is a class which is used to perform increment and decrement operation atomically.
- Atomic Execution: An execution which will be treated as single execution is called Atomic Execution.
- AtomicInteger class provides various methods for atomic execution.
- This class helps to solve Race Condition problem in multi-threaded environment.

# Lock : Locking is a mechanism in multithreaded environment to lock a block of code to avoid Race Condition.
- By Locking mechanism we get more flexibility than synchronization.
- By locking mechanism user gets more flexibility for sequential execution in multithreaded environment.
- It provides various methods for locking and unlocking mechanism.
- It is mandatory for a thread to release the lock so that other thread can take the lock.

Structure :
        Lock l = new ReentrantLock();
        l.lock();
        try{count++ //code}     finally{l.unlock();}

Note : Lock provides a  very popular method tryLock() to avoid deadlocks in the program.

<!-- 31-Jan-2026 -->
# volatile : It is a keyword which is used to declare data member in multithreaded environment. If a data member is declared by volatile keyword then it makes sure that most up-to-date value will be immediately provided to every threads.

# ThreadLocal : It is a class which is used in multithreaded environment to provide every thread its own copy of data. Per thread there will be one local copy of data which eliminates Race Condition problem.
Ex - > TransactionId, DatabaseConnection, Web Session... etc.

# DeadLock: When two threads are using two different resource and waiting for the resource from other thread infinitely which leads to a problem called deadlock.

*Different ways to avoid DeadLock*
1) Global Lock Ordering throughout application must be same.
2) Lock Nesting should be avoided.
3) Use Single Lock instead of multiple lockings.
4) Use tryLock(timeout) with timeout.
5) Use Advance deadlock recovery and detection tools such as Jstack, JMX... etc.


# Inter-Thread Communication: It is a mechan  ism by which one thread communicates with another thread. One thread communicates with another thread internally by using wait() and notify() or notifyAll() mechanism. Inter-Thread communication is achieved through producer-consumer mechanism.

# Producer-Consumer Mechanism: It is a mechanism for Inter-Thread Communication where one thread can communicate with other threads. Producer produces and consumer consumes from shared resource. Internally this is achieved by wait() and notify() method.

Note: In java, classes that ends with 's' are known as Utility classes.

# Thread Pool: Thread Pool is a readymade worker threads which is used to accomplish multiple tasks. Java provides in-built feature by which we can create fixed size worker threads to complete n different tasks. In this manner the performance of application will be drastically improved. In thread pool Executors and ExecutorService class is used to create fixed size thread.
ThreadPool = Ready to use Inbuilt worker threads.
For n task => fixed no. of threads(3 or 4 threads) can finish it.

# Virtual Thread:

# Advantage of MultiThreading :
1) Performance
2) Scale up

<!-- 7/3/26 -->
# Generics: Parameterized Type is called generics. It is introduced in Java 5 update that comes with many advantages.
- Generics is allowed only for Non-Primitive type.

_Type Eraser_: It is a mechanism by which Generics type is erased and replaced by Object to support backward compatibility.

- Generics at method is used in 3 ways:
1) Unbounded            2) Upper Bound          3) Lower Bound
- Advantage of Generics:
1) It provides Type safety.
2) Generics helps to avoid ClassCastException.
3) With the help of generics we do not need to perform downcasting operation which is a risky process.

Note: At the time of compilation Generics Type changes to Object and and when it executes it changes to Type that value is given .
Ex ->

class Box<T>{
        T t;
        Box(T t){ this.t = t; }
        public T getName(){ return t; }
}
class BoxDriver{
        public static void main(String[] args){
                Box<String> b1 = new Box<>("abcd");
                Box<Integer> b2 = new Box<>(186);
                Box<Double> b3 = new Box<>("15.32);
                System.out.println(b1.getValue());       // abcd
                System.out.println(b2.getValue());       // 186
                System.out.println(b3.getValue());       // 15.32
        }
}

Note: Bad practice to use like this.
class Box{
        String s;
        Box(String s){ this.s=s; }
        int x;
        Box(int x){ this.x =x ; }
        double y;
        Box(double y){ this.y=y; }
        Car c;
        Box(Car c){ this.c=c; }
}

# Stream API: It is a powerful feature which was introduced in Java 8 update. By this feature we create a stream on a collection of data then we performed some intermediate operation and followed by terminal operations.
- Strem API is completely based on Lambda Expression and Functional Programming.
- A sequence of elements supporting sequential and parallel aggregate operations.
# Lambda Expression: It is a powerful mechanism to support Functional Type Programming in java. It was introduced in Java 8 update to be used with Functional Type Interface.
Syntax: 
        If one line: n ->(goes as) // code
        If multiple line: n -> {  // code  };

# Stream API :
1) Array
2) Collection
3) String

- dropWhile(), takeWhile(), filter(), skip() , Optional.
