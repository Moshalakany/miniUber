public class Bus extends Rider{

    public Bus(String paletNumber, String color, String manfuctureCompany, String ownerName) {
        super(paletNumber, color, manfuctureCompany, ownerName);
    }

    @Override
    public double TripCost(double distance) {
        return .5*distance;
    }
}
