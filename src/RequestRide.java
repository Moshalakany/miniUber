public class RequestRide {
        Rider ridetype;
        private static RequestRide instance = null;
    private String passengerName;
    private String pickupLocation;
    private String destination;
    public static double cost;
    private RequestRide() {}
    public static RequestRide getInstance() {
        if (instance == null) {
            synchronized (RequestRide.class) {
                if (instance == null) {
                    instance = new RequestRide();
                }
            }
        }
        return instance;
    }

    public void setRideDetails(Rider rideType, String pickupLocation, String destination) {
        this.ridetype = rideType;
        passengerName = MainMenu.user.getUserName();
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }


    public void requestRide() {
        int distance = ridetype.generateDistance();
        if (pickupLocation != null && destination != null && ridetype != null) {
            System.out.println("Ride requested for " + passengerName);
            System.out.println("Pickup from: " + pickupLocation + " to " + destination);
            System.out.println("Transportation type: "+ ridetype.getClass().getName());
            System.out.println("The distance: "+ distance+ " KM");
            System.out.println("The price: "+ ridetype.TripCost(distance)+ " EGP");
            System.out.println("More Details: "+ ridetype.DisplayDetails());
            cost=ridetype.TripCost(distance);
        } else {
            System.out.println("Please provide all ride details before requesting a ride.");
        }
    }
}
