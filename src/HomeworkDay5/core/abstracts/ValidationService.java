package HomeworkDay5.core.abstracts;

import HomeworkDay5.entities.concretes.User;

public interface ValidationService {
    boolean check(User user);
}