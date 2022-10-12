import java.util.Objects;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean dataVerification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.matches("\\w+") && login.length() >= 1 && login.length() <= 21) {
            if (password.matches("\\w+") && password.length() >= 1 && password.length() <= 21 && password.equals(confirmPassword)) {
                return true;
            } else {
                throw new WrongPasswordException("Некорректнный логин");
            }
        } else {
            throw new WrongLoginException("Некорректнный логин");

        }
    }
}
