package inheritance;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer mahmut = new IndividualCustomer();
        mahmut.customerNumber="12345";

        CorporateCustomer ibm = new CorporateCustomer();
        ibm.customerNumber="54321";



        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(ibm);
        //customerManager.add(mahmut);

        Customer[] customers = {mahmut,ibm};

        customerManager.addMultiple(customers);


    }

}
