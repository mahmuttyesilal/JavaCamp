package HomeworkDay5.core.entities;

import HomeworkDay5.core.abstracts.ValidationService;
import HomeworkDay5.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck implements ValidationService {

    String passwordRegex = "^.{6,}$";
    Pattern passwordPattern = Pattern.compile(passwordRegex);

    @Override
    public boolean check(User user) {
        Matcher matcher = passwordPattern.matcher(user.getPassword());

        if (matcher.matches()) {
            return true;
        } else {

            System.out.println("Geçersiz şifre");
        }
        return false;
    }

}
