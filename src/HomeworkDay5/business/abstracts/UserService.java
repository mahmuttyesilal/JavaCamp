package HomeworkDay5.business.abstracts;

import HomeworkDay5.entities.concretes.User;

import java.util.List;

public interface UserService {

    void register(User user);

    void login(User user);

    List<User> getAll();
}
