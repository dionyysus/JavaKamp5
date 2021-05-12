package Core.concretes;

import Core.abstracts.EmailService;
import Entities.concretes.User;

public class EmailManager implements EmailService {
    @Override
    public void sendVerifyEmail(User user) {
        System.out.println("Your verification e-mail has been sent to your address: " + user.getMail());

    }

    @Override
    public void clickToVerify(User user) {
        System.out.println("Click on the link to verify your registration: " + user.getFirstName());

    }
}
