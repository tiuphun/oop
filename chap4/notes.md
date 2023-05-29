# INSTANCE MEMBER vs. CLASS MEMBER
Attributes that are universal for every object, can be accessed by all object are class members.
Attributes that are copied and received different values in individual objects are instance members.

** How to count the number of instances of an object? **
We initialize a counter (i.e `public static int counter`) and increse it inside every constructors.

> Class member cannot access instance member, since there is ambiguity the member in exactly which instance we are trying to access. `this` cannot be used inside class member. However, the reverse is possibile. 

# CONSTANT MEMBER
There are:
* Constant member of a class: `public static final String name`. Be sure that this is initialized when a class is created.
* Constant member of an object: `public final String name`. Be sure that this is assigned a value when an object is created.

> `final` means a member is a constant, its value is assigned only once. `static` indicates that a member is belongs to a class.

# STATIC BLOCK
A static block of code is always run once when the class contains it is loaded. Class members can also be init here.
```js
static {
    CLASS_MEMBER = "value"; 
}
```

