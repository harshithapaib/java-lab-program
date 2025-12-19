// User-defined exception
class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

// Base class
class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative");
        }
        fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

// Derived class
class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than Father's age");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

// Main class
public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        try {
            Son s = new Son(50, 25);
        } catch (WrongAge e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
