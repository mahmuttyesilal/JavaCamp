package HomeworkDay5.business.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HomeworkDay5.dataAccess.abstracts.UserDao;
import HomeworkDay5.entities.concretes.User;
import HomeworkDay5.business.abstracts.UserService;
import HomeworkDay5.core.abstracts.ValidationService;


public class UserManager implements UserService {

    private ValidationService[] validationServices;
    private UserDao userDao;
    private ArrayList<User> users;

    public UserManager(ValidationService[] validationService, UserDao userDao, ArrayList<User> users) {
        this.validationServices = validationService;
        this.userDao = userDao;
        this.users = users;
    }

    @Override
    public void register(User user) {
        for (ValidationService validationService : this.validationServices) {
            if (validationService.check(user) == false) {
                System.out.println("Failed to register!! Try again");
                return;

            }
        }

        int verificationCode = (int) (Math.random() * 100000);
        System.out.println(verificationCode);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the verification code ");
        int verification = scanner.nextInt();

        if (verificationCode == verification) {
            System.out.println("Verification is successful");
        } else {
            System.out.println("Incorrect!! please try again");
        }
        this.userDao.add(user);
        userDao.add(user);

    }

    @Override
    public void login(User user) {

        for (User user1 : users) {
            if (user1.getEmail() == user.getEmail() && user1.getPassword() == user.getPassword()) {
                System.out.println("Welcome back : " + user1.getUserName());
                return;
            }

        }
        System.out.println("Sign in not successful");
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
