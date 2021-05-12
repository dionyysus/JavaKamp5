package Core.abstracts;

public interface CheckService {
    boolean checkPassword(String password);
    boolean checkEmail(String email);
    boolean checkFirstName(String firstName);
    boolean checkLastName(String lastName);

}
