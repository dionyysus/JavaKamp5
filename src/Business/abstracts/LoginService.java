package Business.abstracts;

import Entities.concretes.User;

public interface LoginService {

    void register(User user);
    void login(String email, String password);

}
