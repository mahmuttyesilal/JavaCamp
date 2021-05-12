package HomeworkDay5.dataAccess.abstracts;

import HomeworkDay5.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
}
