package HomeworkDay5.core.entities;

import HomeworkDay5.core.abstracts.ValidationService;
import HomeworkDay5.entities.concretes.User;

import java.util.ArrayList;

public class RepetitionCheck implements ValidationService {

    private ArrayList<String> mailControl;

    public RepetitionCheck(ArrayList<String> mailControl) {
        this.mailControl = mailControl;
    }

    @Override
    public boolean check(User user) {
        if (this.mailControl.isEmpty()) {
            System.out.println("email eklendi");
            this.mailControl.add(user.getEmail());
            return true;
        } else {
            for (String mail : this.mailControl) {
                if (mail == user.getEmail()) {
                    System.out.println("email sistemde mevcut");
                    return false;
                }
            }
            System.out.println("email eklendi");
            this.mailControl.add(user.getEmail());
            return true;
        }
    }
}
