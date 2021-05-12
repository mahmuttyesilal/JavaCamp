package HomeworkDay5.dataAccess.concretes;

import HomeworkDay5.dataAccess.abstracts.UserDao;
import HomeworkDay5.entities.concretes.User;

public class UserBaseDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getUserName() + " isimli kullanıcı sisteme eklendi.");
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getUserName() + " isimli kullanıcı sistemden silindi.");
    }
}
