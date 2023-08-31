public abstract class Rider {
     String PaletNumber;
     String color;
     String manfuctureCompany;

     String OwnerName;
     double TripPrice;

    public Rider() {}

    public Rider(String paletNumber, String color, String manfuctureCompany, String ownerName) {
        PaletNumber = paletNumber;
        this.color = color;
        this.manfuctureCompany = manfuctureCompany;
        OwnerName = ownerName;
    }

    public abstract double TripCost(double distance);

    public int generateDistance(){
        int min=5;
        int max=70;
        int random_distance = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_distance;
    }

    public String DisplayDetails() {
        return "{" +
                "Palet Number='" + PaletNumber + '\'' +
                ", color='" + color + '\'' +
                ", manfucture Company='" + manfuctureCompany + '\'' +
                ", OwnerName='" + OwnerName + '\''+
                '}';
    }
}
