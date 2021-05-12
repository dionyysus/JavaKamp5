package Core.abstracts;

import Entities.concretes.User;

public interface EmailService {

    void sendVerifyEmail(User user);
    void clickToVerify(User user);

}
