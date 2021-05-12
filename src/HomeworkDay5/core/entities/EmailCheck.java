package HomeworkDay5.core.entities;

import HomeworkDay5.core.abstracts.ValidationService;
import HomeworkDay5.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck implements ValidationService {

    String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);

    @Override
    public boolean check(User user) {
        Matcher matcher = emailPattern.matcher(user.getEmail());
        if (matcher.matches()){
            return true;
        }else {
            System.out.println("Invalid Email!!");
            return false;
        }
    }
}
