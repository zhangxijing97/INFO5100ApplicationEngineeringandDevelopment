# HW to Chapter 9 “Classes – OOD, OOPs” (as in lectures)

1) What is a class constructor and why is it needed?

A class constructor in Java is a special type of method that is automatically called when an instance of a class is created. Its primary purpose is to initialize the newly created object. Constructors typically set initial values for the object's attributes or perform any necessary setup tasks. They have the same name as the class and do not have a return type. Constructors are needed to ensure that objects are properly initialized before they are used, thus helping to avoid errors and ensure the correct behavior of the objects.

2) What is the meaning of the following access modifiers: "public", "private", "protected", and "default"?

public: When a member (field, method, or nested class) is declared as public, it can be accessed from any other class. There are no access restrictions.

private: Private members can only be accessed within the same class. They are not visible to any other class, even subclasses.

protected: Protected members are accessible within the same package or by subclasses, regardless of whether the subclass is in a different package.

default (no modifier): Also known as package-private, members with no explicit access modifier are accessible only within the same package. They are not accessible to classes outside the package.

3) What is the meaning of the following non-access modifiers: "final" and "abstract"?

final: When applied to a class, method, or variable, final indicates that it cannot be subclassed, overridden, or changed. For a variable, it means its value cannot be modified once initialized. For a method, it means it cannot be overridden by subclasses. For a class, it means it cannot be extended.

abstract: Abstract classes and methods are declared with the 'abstract' keyword. Abstract classes cannot be instantiated themselves; they are meant to be extended by subclasses. Abstract methods are declared without a body and are meant to be implemented by subclasses. Classes containing abstract methods must also be declared abstract.

4) What is a Java package?

A Java package is a mechanism for organizing classes into namespaces. It helps in avoiding naming conflicts and provides a way to encapsulate a group of related classes, interfaces, and sub-packages. Packages are hierarchical, meaning you can have sub-packages within packages. Packages are also used for access control, where classes within the same package can access each other's members without any access modifiers. Package names typically follow the reverse domain name convention to ensure uniqueness.