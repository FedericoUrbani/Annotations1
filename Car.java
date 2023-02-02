

public class Car {

String modelName;
String mileage;

    public Car(String modelName, String mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }


    @Deprecated
    public void printCarDetails(){

        System.out.print(this.modelName+" "+this.mileage);

    }
    public void getCarDetails(){
        System.out.println(this.modelName);
        System.out.println(this.mileage);


    }
}
