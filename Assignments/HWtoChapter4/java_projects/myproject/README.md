# Non-programming Assignment

## Bits and Bytes

- **Bit**: 1 bit is a memory size of one binary memory cell that can take values 0 or 1.<dv>
  Example: 1

- **Byte**: 1 byte equals 8 bits, thus can take values in the range of 28 in the range from 0 to 255.<dv>
  Example: 00001111<dv>

## Types and Variables

- **Types**: Types define the kind of data that can be stored and manipulated in a programming language. Common types include integers, floating-point numbers, characters, and booleans.
  Example: int num = 10; // Declaring an integer variable 'num' with value 10.

- **Variables**: Variables are named storage locations that hold data values. They have a type that defines the kind of data they can store.
  Example: double price = 19.99; // Declaring a double variable 'price' with value 19.99.

## Local and Instance Variables

- **Local Variables**: Local variables are declared within a method or block and exist only within that scope.
  Example: void method() { int x = 5; } // 'x' is a local variable within the 'method'.

- **Instance Variables**: Instance variables are declared within a class but outside any method, constructor, or block. They are initialized when an object of the class is created.
  Example: class MyClass { int y; } // 'y' is an instance variable of class 'MyClass'.

## Class (Static) Variables

- **Class Variables**: Class variables, also known as static variables, are declared with the static keyword within a class but outside any method. They are shared among all instances of the class.
  Example: class MyClass { static int count = 0; } // 'count' is a class variable.

## Mutable and Immutable Variables

- **Mutable Variables**: Mutable variables can be changed after they are created. Their state or value can be modified.
  Example: private String s;

- **Immutable Variables**: Immutable variables cannot be changed after they are created. Any operation on them returns a new value.
  Example: private final String s;

## Classes and Objects

- **Classes**: A class is a blueprint for creating objects. It defines attributes and behaviors that objects of the class will have.
  Example: class Car { String make; int year; } // 'Car' is a class with attributes 'make' and 'year'.

- **Objects**: An object is an instance of a class. It represents a real-world entity and has state and behavior defined by its class.
  Example: Car myCar = new Car(); // 'myCar' is an object of class 'Car'.

## Conclusion

This README.md file provides a basic understanding of key programming concepts such as bits, bytes, types, variables, mutability, and classes. Understanding these concepts is essential for developing software applications and solving computational problems.
