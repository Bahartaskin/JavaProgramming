package day30_CustomClass;

public class Car {

    public String brand; // we made these instance because we need separate copies of each object (car1,car2,car2 each car has separate brand)
    public String model; // each car has different model, so we create this attribute as an instance
    public String color;
    public int year;
    public double price;

    // to set one method for all instances of car class
    //when this method called we need to pass 5 argument
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() { // used for creating the object on the console(to print)
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }

    public  void  start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
