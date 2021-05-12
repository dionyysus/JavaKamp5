package Business.concretes;

import Business.abstracts.LoginService;
import Business.abstracts.UserService;
import Core.abstracts.GoogleService;
import Entities.concretes.User;

public class UserManager implements UserService {

    private LoginService loginService;

    private GoogleService googleService;

    public UserManager(LoginService loginService, GoogleService googleService) {
        this.loginService = loginService;
        this.googleService = googleService;
    }


    @Override
    public void login(String email, String password) {

        loginService.login(email,password);

    }

    @Override
    public void register(User user) {

        loginService.register(user);

    }

    @Override
    public void registerGoogle() {

        googleService.registerToSystem();

    }
}
