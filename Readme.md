# ARRAYLIST
- ArrayList is a class that is part of the **java.util package** and provides a dynamic array-like data structure. 
- It is a commonly used implementation of the **List interface** and allows you to store and manipulate a collection of elements.
## Difference between Array and Arraylist
- Arrays have a fixed size,  once an array is created its size cannot be changed while ArrayLists have a dynamic size and can grow or shrink dynamically as elements are added or removed.
-  Arrays provide direct access to elements using an index.ArrayLists, however, provide methods like get() and set() to access and modify elements. They do not allow direct access using an index.
- Arraylists provide memory management they handle memory management internally. They automatically resize themselves and manage memory allocations, making them more convenient to use. while array you have to specify
- Arrays are specific to type.ArrayLists, on the other hand, are type-safe and can only store objects (not primitive types). They can handle any type of object through the use of Java's autoboxing feature.
- *In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.*
- We can not create an array list of the primitive types, such as int, float, char, etc. use wrapper class
        ```
        ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
        ```