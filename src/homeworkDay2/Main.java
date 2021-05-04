package homeworkDay2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("34 HD 6315","Otomobil");
        Car car2 = new Car("34 GZ 34","Kamyon");

        Car[] cars = {car1,car2};

        for (Car car : cars) {
            System.out.println(car.plaka + " plakalı araç eklendi.");
        }

        Otopark otopark1 = new Otopark("Mahmut Yeşilal",20);
        Otopark otopark2 = new Otopark("Test Test",40);

        Otopark[] otoparks = {otopark1,otopark2};

        for (Otopark otopark:otoparks) {
            System.out.println(otopark.displayname + " araç sahibi " + otopark1.money + " ücreti ödedi.");
        }

        System.out.println("------------------------------------");
        CarManager carManager = new CarManager();
        carManager.entryToPark(car1);
        carManager.leaveFromPark(car2);
        System.out.println("---");
        OtoparkManager otoparkManager = new OtoparkManager();
        otoparkManager.saveCar(otopark1);
        System.out.println("------------------------------------");
        
    }
}
