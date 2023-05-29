# ACCESS RULES (Nguyên lý truy cập)
This principle defines how attributes and methods are accessed by other objects - whether those can be used if exist in another class.
* `public`: always allowed
* `protected`: allowed in subclasses
* `private`: not allowed
* `default/ package-private`: same as `protected`

# INHERITANCE RULES (Nguyên lý kế thừa)
This principle defines what classes can inherit from one another. 
* `public`: always allowed
* `protected`: same as `public` 
* `private`: not allowed
* `default/ package-private`: only allowed if in the same package

> A parent class can have the attributes which are set to `private`. In the case of a subclass, it can't access those attributes directly (see **Access Rules**). However, it does inherit those attributes (see **Inheritance Rules**) and can use them through the parent class's methods.