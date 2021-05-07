package interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers ={new SmsLogger(),new EmailLogger(),new DatabaseLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer mahmut = new Customer(1,"Mahmut","Yesilal");
        customerManager.add(mahmut);
    }
}
