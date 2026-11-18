
public class BusFare {

    public static void main(String[] args) {

        double distance = 120;
        double farePerKm = 2.5;

        double totalFare = distance * farePerKm;

        System.out.println("BUS FARE CALCULATOR");
        System.out.println("-------------------");
        System.out.println("Travel Distance: " + distance + " km");
        System.out.println("Fare Per KM: Rs. " + farePerKm);
        System.out.println("Total Bus Fare: Rs. " + totalFare);

    }
}
