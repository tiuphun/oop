# IMPORT AND USING CLASS FROM PACKAGE
1. To access a public class in different package, import the package at the top of the code.
    or write its full name `lesson3.student s2`
2. By writing nothing, the access modifier is DEFAULT -> only used inside the package only.
3. Import all: `import lesson3.*`
4. Inside the same package only unique class name is allowed. In different package, classes could have the same name.

# OOP STRUCTURE
1. Standalone variables are not allowed in Java. They must be declared inside a class.
    ```js
    class Student{
    
    }
    int i;
    ```
2. `m()` inside declaration is called "operation"; but implemented is called "method".

# METHOD
1. Non-void methods should always have `return` statement.
2. Void methods can have `return` or not.
3. Only return at most 1 value.

# ENCAPSULATION & DATA HIDING
It is a good practice to always assign access modifier to attributes and methods.
-> Attributes should be `private`, while the corresponding methods should be `public`
->  `getX` method: retrieve info, no modify (read)
    `setX` method: modify X (write)

# CONSTRUCTOR
* Same name
* No return value (even `void`)
* Can use access modifier (public, private...)
* Can do anything inside here -> Usually used for declaring attributes

# this
1. Allow for clear understanding when parameters' names and attributes'names are the same.

    ```js
    public Student (String name, int age) {
            this.name = name;
            this.age = age;
        }
    ```
2. The setter method are preferred over declaring with `this` inside constructor.
    -> Flexible access modifier assignment
    -> Avoid duplicate codes
3. Allow for constructors to call each other.

> Normal methods are NOT allowed to have the same signature; as of constructor. However, a constructor and a normal method could have the same signature.