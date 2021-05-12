package HomeworkDay5.core.entities;

import HomeworkDay5.core.abstracts.ValidationService;
import HomeworkDay5.entities.concretes.User;

public class FirstAndLastNameCheck implements ValidationService {
    @Override
    public boolean check(User user) {
        if (user.getUserName().length() > 2 && user.getLastName().length() > 2) {
            return true;
        } else {
            System.out.println("Ad ve soyad en az iki karakterden oluşabilir.");
            return false;
        }
    }
}
