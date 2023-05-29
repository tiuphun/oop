# INSTRUCTION
1. To compile: `javac filename.java`. If succeeded a new file .class with the same name should appear.
2. To run: `java filename`.

# LESSON LEARNED
1. Java is case sensitive.
2. 'Class X is public, should be declared in the file' error: The .java file should have the same name with X (X.java - also case-sensitive)
3. Can I define more than one public class in a Java package?
    -> No, while defining multiple classes in a single Java file you need to make sure that only one class among them is public. If you have more than one public classes a single file a compile-time error will be generated.