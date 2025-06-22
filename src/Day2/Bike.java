package Day2;
public class Bike{
   private String model;
   private String company;
   private String bikeColour;
   private String bikeName;
   private String purchasedDate;
   private int engineNumber;
   private int velocity;


    Bike(String bikeName ,String model , String company,String bikeColour , String purchasedDate , int engineNumber  ){
        this.model = model;
        this.company = company;
        this.bikeColour = bikeColour;
        this.bikeName = bikeName;
        this.purchasedDate = purchasedDate;
        this.engineNumber = engineNumber;
    }

    public String getModel(){
        return model;
    }
    public String getBikeName(){
        return bikeName;
    }

    public String getCompany(){
        return company;
    }

    public String getPurchasedDate(){
        return purchasedDate;
    }

    public int getEngineNumber(){
        return engineNumber;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setBikeName(){
        this.bikeName = bikeName;
    }
    public void setBikeColour(){
        this.bikeColour = bikeColour;
    }
    public void pressBrake(){
        System.out.println("Bike is stopped");
    }

    public  void releaseBrake(){
        System.out.println("Bike is in motion ");
    }



    public int accelerate(int velocity){

       System.out.println("Bike is accelerated by  " + velocity  + " meter per second");
        return velocity;
    }

    public void turnOnSideLight(){
        System.out.println("Side light is turned on");
    }



}