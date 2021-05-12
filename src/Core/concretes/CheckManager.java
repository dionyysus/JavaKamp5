package Core.concretes;

import Core.abstracts.CheckService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager implements CheckService {

    public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    @Override
    public boolean checkPassword(String password) {
        if(password.length()<6) {
            System.out.println("The password must be at least 6 characters.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkEmail(String email) {
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) {
            System.out.println("You did not enter the appropriate e-mail in Regex format.");
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean checkFirstName(String firstName) {
        if(firstName.length()<2) {
            System.out.println("Your name must contain at least 2 characters.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkLastName(String lastName) {
        if(lastName.length()<2) {
            System.out.println("Your surname must contain at least 2 characters.");
            return false;
        }
        return true;
    }
}
