# Builder
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

Builder = provides the implementation for the building steps
- extract the object construction code out of its own class and move it to separate objects (builders)
- The pattern organizes object construction into a set of steps. To create an object, execute a series of these steps on a builder object. 

Director (optional) = defines the order in which to execute the building steps 
- hides the details of product construction from the client code

+ get rid of a “telescoping constructor” 
+ when you want your code to be able to create different representations of some product
+ when construct Composite trees or other complex objects

Builder: 
- focuses on constructing complex objects step by step
- run some additional construction steps before fetching the product
Abstract Factory: 
- specializes in creating families of related objects
- returns the product immediately
