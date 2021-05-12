package Business.abstracts;

import Entities.concretes.User;

public interface UserService {

    void login(String email, String password);
    void register(User user);
    void registerGoogle();

}
