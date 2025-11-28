
class InvalidRentException extends Exception {
    public InvalidRentException(String message) {
        super(message);
    }
}

// Base Class
class HotelRoom {
    protected double rent;

    public HotelRoom(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }
}

// Derived Class
class LuxuryRoom extends HotelRoom {
    private double luxuryRent;

    public LuxuryRoom(double baseRent, double luxuryRent) throws InvalidRentException {
        super(baseRent);
        this.luxuryRent = luxuryRent;
// Throw exception if luxury rent < base rent
        if (luxuryRent < baseRent) {
            throw new InvalidRentException(
                "Luxury room rent (" + luxuryRent + ") cannot be less than base room rent (" + baseRent + ")!"
            );
        }
    }

    public double getLuxuryRent() {
        return luxuryRent;
    }
}

// Main Class
public class HotelDemo {
    public static void main(String[] args) {
        try {
            HotelRoom baseRoom = new HotelRoom(2000);
            LuxuryRoom luxuryRoom = new LuxuryRoom(baseRoom.getRent(), 1500); // This will throw exception
            System.out.println("Base Room Rent: " + baseRoom.getRent());
            System.out.println("Luxury Room Rent: " + luxuryRoom.getLuxuryRent());
        } catch (InvalidRentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Example with valid rent
        try {
            HotelRoom baseRoom = new HotelRoom(2000);
            LuxuryRoom luxuryRoom = new LuxuryRoom(baseRoom.getRent(), 3000);

            System.out.println("Base Room Rent: " + baseRoom.getRent());
            System.out.println("Luxury Room Rent: " + luxuryRoom.getLuxuryRent());
        } catch (InvalidRentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}




