package org.example.week7_object_oriented_programming;


// This class can't run by itself because it lacks a main method, it's meant to be used inside it instead.
public class Pool {



    // private meaning that only the class itself can only use.
    private String name; // this would be called a 'field variable' since it can be used everywhere in the class.
    private double length;



    // This is a constructor because the function name is the class name, and it has no return types.
    // If we called this method for example, then it will create a Pool object if we assign it to a Pool type.
    // like this:
    // Pool swimmingPool = new Pool("Swimming Pool", 12.2);
    // 'new' calls the object's constructor.
    public Pool(String name, double length) {
        // if the parameter and field from the class have the same name, then you can use 'this'.
        // What 'this' does is takes the variable name of the class instead of the parameter name.
        // For me, I would use 'this' exclusively for constructors because I feel that it is a
        // proper way of using 'this' because you are exactly assigning those variables to the fields in the class.
        this.name = name;
        this.length = length;
    }

    // This is an instance method. An instance is simply an object.
    // So this basically would be an object method.
    public double distanceForLaps(int laps) {
        return laps * length;
    }

    // if we had no 'toString()' method and printed the object itself,
    // then it will print the package, the object name, and the memory address instead.
    // This makes it so we can pass instead a human-readable string.
    @Override
    public String toString() {
        String description = String.format("%s pool is %.2f meters long.",
                name, length);
        return description;
    }


    // Setters and getters might seem redundent, however, they are not and here's why:
    // 1. It prevents accidental mutation
    // 2. getters and setters can be modified, like for example clamping a number's set.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length < 0.0) {
            this.length = 0.0;
            return;
        }

        this.length = length;
    }
}
