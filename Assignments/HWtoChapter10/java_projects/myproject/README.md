# HW to Chapter 10 – Inheritance, Polymorphism, Inner Classes, Abstraction, and Interface

1) Can a class be derived (inherit) from two different independent classes?
In Java, a class cannot inherit from two different classes directly. This restriction is due to Java not supporting multiple inheritance to avoid complexity and simplify design, especially to sidestep the "Diamond Problem." However, Java allows a class to implement multiple interfaces, which can achieve a form of multiple inheritance.

2) Can a class be derived (inherit) from a “final” class?
No, a class cannot be derived from a final class. In Java, the final keyword on a class definition means that the class cannot be extended or inherited. The primary reason for marking a class as final is to lock the class from being subclassed, often for reasons of security, simplicity, or optimization.

3) What is polymorphism, how it works, and why is it needed?
Polymorphism is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common super class. It literally means "many shapes" or "many forms." Polymorphism in Java is mainly divided into two types: compile-time polymorphism (achieved by method overloading) and runtime polymorphism (achieved by method overriding).

How it works: Compile-time polymorphism is achieved in Java using method overloading, where multiple methods can have the same name with different parameters within the same class. Runtime polymorphism is achieved using method overriding, where a subclass provides a specific implementation of a method that is already provided by its superclass.

Why it's needed: Polymorphism allows for flexibility and the ability to define one interface and have multiple implementations. It's a foundational concept for achieving loose coupling, making systems easier to extend and maintain.

4) What is an inner (nested) class?
An inner class or nested class is a class defined within another class. Java supports four types of nested classes:

Static Nested Classes: Behave like static members and can access only the static members of the
Inner Classes (Non-static Nested Classes): Have access to all members of the outer class and are associated with an instance of the outer class.
Local Classes: Defined within a block, typically within a method body.
Anonymous Classes: A special case of local classes that do not have a name and are declared and instantiated all in one statement as part of the expression.
Nested classes are used to logically group classes that are only used in one place, increase encapsulation, or to create more readable and maintainable code.

5) What is an abstract class and why is it needed?
An abstract class in Java is a class that cannot be instantiated on its own and may contain abstract as well as concrete methods. Abstract methods are those that are declared without an implementation.

Why it's needed: Abstract classes are used when we want to provide a common definition of a base class that multiple derived classes can share and extend. They allow you to define a template for a group of subclasses, enforcing a contract for subclasses to implement specific abstract methods, thus promoting a consistent design.

6) What is an “interface” class in Java?
In Java, an interface is not a class but a reference type that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructor methods. Classes and enums can implement interfaces, thereby inheriting the abstract methods of the interface.

Purpose of interfaces: Interfaces are used to define a contract for classes without specifying how the methods should be implemented. They are used to achieve abstraction and multiple inheritance in Java. Interfaces are great for defining capabilities that can be shared across different classes, even if those classes do not share the same parent class.