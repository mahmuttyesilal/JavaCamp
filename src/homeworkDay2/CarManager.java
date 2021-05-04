package homeworkDay2;

public class CarManager {
    public void entryToPark(Car car) {
        System.out.println(car.tipi + " tipli, " + car.plaka + " plakalı araç otoparka giriş yapmıştır.");
    }

    public void leaveFromPark (Car car) {
        System.out.println(car.tipi + " tipli, " + car.plaka + " plakalı araç otoparktan ayrılmıştır.");
    }
}
