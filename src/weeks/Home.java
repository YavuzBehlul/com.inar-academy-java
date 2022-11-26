package weeks;

public class Home {
    private double area;
    private int numberOfBathrooms;
    private boolean garage;
    private  double fee;
    private double rentalFee;
    private String front;
    private int ageOfHome;

     Home(){
        this(0,0,false,0,0,null,0);
    }

     public Home(double area, int numberOfBathrooms, boolean garage, double fee,
                double rentalFee, String front, int ageOfHome){

        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
        this.garage=garage;
        this.fee= fee;
        this.rentalFee=rentalFee;


    }
    public double getArea(){
        return area;
    }
    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public boolean getGarage(){
         return  garage;
    }
    public double getFee(){
         return fee;
    }
    public double getRentalFee(){
         return rentalFee;
    }
    public String getFront(){
         return front;
    }
    public int getAgeOfHome(){
         return ageOfHome;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setNumberOfBathrooms(int numberOfBathrooms){
        this.numberOfBathrooms =  numberOfBathrooms;
    }

    public void toPrint(){
        System.out.println("Home's area: " + this.area);
        System.out.println("Home's numberOfBath: " + this.numberOfBathrooms);
        System.out.println("Home's area: " + getArea());
        System.out.println("Home's area: " + getArea());
        System.out.println("Home's area: " + getArea());
        System.out.println("Home's area: " + getArea());
        System.out.println("Home's area: " + getArea());
        System.out.println("Home's area: " + getArea());
    }
    //endregion
    //</editor-fold>
}
