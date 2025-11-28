class WrongAge extends Exception {
    public WrongAge(String msg) {
        super(msg);
    }
}

// Base Class Father
class Father {
    int fatherAge;

    // Constructor
    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

// Derived Class Son
class Son extends Father {
    int sonAge;

    // Constructor
    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Call Father constructor
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age!");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

// Main Class
public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        try {
            // Valid case
            Son s1 = new Son(45, 20);

            // Invalid case: Father's age negative
            Son s2 = new Son(-40, 15);

            // Invalid case: Son's age >= Father's age
            Son s3 = new Son(40, 50);

        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}