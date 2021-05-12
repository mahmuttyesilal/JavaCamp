package HomeworkDay5;

import HomeworkDay5.business.abstracts.UserService;
import HomeworkDay5.business.entities.UserManager;
import HomeworkDay5.core.abstracts.ValidationService;
import HomeworkDay5.core.entities.EmailCheck;
import HomeworkDay5.core.entities.FirstAndLastNameCheck;
import HomeworkDay5.core.entities.PasswordCheck;
import HomeworkDay5.dataAccess.concretes.UserBaseDao;
import HomeworkDay5.entities.concretes.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValidationService[] validationServices = {new FirstAndLastNameCheck(), new EmailCheck(), new PasswordCheck()};

        UserService userService = new UserManager(validationServices,new UserBaseDao(),new ArrayList<User>());

        User user = new User("Mahmut","Yeşilal","mahmutyesilal","mahmuttyesilal@gmail.com","112233");
        userService.register(user);
    }
}
