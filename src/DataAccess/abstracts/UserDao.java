package DataAccess.abstracts;

import Entities.concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void delete(User user);
    List<User> getAll();
    boolean mailExist(User user);

}
