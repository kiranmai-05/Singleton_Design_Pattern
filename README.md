Singleton Design Pattern in Java

#Overview

This project demonstrates the Singleton Design Pattern in Java using a 'Configuration' class.

The Singleton Pattern is a 'Creational Design Pattern' that ensures only one instance of a class is created and provides a common way to access that instance.

In this project, the 'Configuration' class stores application configuration details such as:

-Application Name
- Database URL
- Server Port

The 'Configuration' class uses a private constructor, a static instance variable, and a static 'getInstance()' method to control object creation.

The 'Client' class accesses the configuration using 'getInstance()' and verifies that multiple references point to the same object using the '==' operator.

#Key Concepts

- Singleton Design Pattern
- Creational Design Pattern
- Private Constructor
- Static Instance
- Lazy Initialization
- Static Method
- Object Reference Comparison

# Example

java
Configuration obj1 = Configuration.getInstance(
        "Instagram",
        "jdbc:mysql://localhost:3306/mydb/",
        800
);

Configuration obj2 = Configuration.getInstance(
        "Whatsapp",
        "jdbc:mysql://localhost:3306/mydb1/",
        900
);

System.out.println(obj1 == obj2);
output:
True
