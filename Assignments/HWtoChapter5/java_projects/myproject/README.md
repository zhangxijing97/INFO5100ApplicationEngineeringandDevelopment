# Non-programming Assignment

1) Strings in Java
Strings in Java are objects that represent a sequence of characters. The String class is used to create and manipulate strings. Since strings are immutable in Java, any modification to a string results in the creation of a new string.

Major operations with strings include:

Concatenation: Combining two or more strings into one.
Substring: Extracting a portion of a string.
Length: Determining the number of characters in a string.
Character extraction: Getting a single character from a string at a specified position.
Comparison: Comparing two strings for equality or lexical ordering.
Conversion: Changing the case of a string, converting between strings and other data types, etc.

2) Linear and Non-Linear Data Structures in Java
Linear data structures: Elements are arranged in a sequential order where each element is connected to its previous and next element in a single level. Examples include Arrays, Linked Lists, Stacks, and Queues.

Non-linear data structures: Elements are not arranged in a sequential order, and each element might connect to multiple elements to reflect a hierarchical structure. Examples include Trees and Graphs.

3) Arrays and Matrices in Java
Arrays are a collection of elements of the same type placed in contiguous memory locations. They are fixed in size, and the elements can be accessed using their index.

Matrices in Java can be represented using two-dimensional arrays. A matrix is essentially a grid or a table of elements arranged in rows and columns.

4) ArrayList in Java
ArrayList is a part of the Java Collections Framework. It represents a resizable array, allowing elements to be added or removed dynamically. Unlike arrays, ArrayList can change its size during runtime.

Differences between Array and ArrayList:

Size: Arrays are fixed in size, while ArrayLists can grow or shrink.
Type Safety: Arrays are type-safe, meaning they can store only one type of objects. ArrayLists can store any type of objects (prior to generics) but are now more commonly used with a specific type.
Performance: Operations like adding or removing elements from the end of an ArrayList are generally faster than doing the same with an array. However, arrays have a slight performance advantage for indexed access and storage.

5) LinkedList in Java
LinkedList is a part of the Java Collections Framework and represents a doubly-linked list. Each element (node) in a LinkedList contains two links: one pointing to the next element and another pointing to the previous element.

It's particularly efficient for dynamic data manipulation, such as adding or removing elements from any position within the list, especially at the beginning or end.

6) HashSet and HashMap in Java
HashSet is a collection that does not allow duplicate elements. It's an implementation of the Set interface and is backed by a hash table. It's efficient for operations like add, remove, and contains.

HashMap is a map implementation that stores key-value pairs. Keys are unique, and each key maps to exactly one value. The elements in a HashMap are not ordered. It provides constant-time performance for basic operations (assuming the hash function disperses elements properly across the buckets).

7) Stacks and their hierarchy in Java
A Stack is a linear data structure that follows the Last In, First Out (LIFO) principle. The last element added to the stack is the first one to be removed. Java has a Stack class that extends Vector, providing methods like push(), pop(), peek(), and isEmpty().

Hierarchy: The Stack class is part of the Java Collections Framework, but it's a legacy class that extends Vector. For stack operations, it's recommended to use Deque interface implementations like ArrayDeque.

8) Queues in Java
A Queue is a linear data structure that follows the First In, First Out (FIFO) principle. Elements are added to the rear and removed from the front. Java provides the Queue interface in the Java Collections Framework, with various implementations such as LinkedList, PriorityQueue, etc.

Queues are used for holding elements prior to processing, with methods like add(), offer(), remove(), poll(), peek(), etc., for managing elements.