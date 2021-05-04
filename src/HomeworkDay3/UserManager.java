package HomeworkDay3;

public class UserManager extends User{
    public void login(User user){
        System.out.println("Kullanıcı " + user.getFirstName() +" " + user.getLastName() + " " + user.getEmail() + " " + user.getPassword() +" bilgileri ile giriş yaptı.");
    }
    public void logout(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " sistemden çıkış yaptı.");
    }
    public void update(User user){
        System.out.println("Kullanıcı bilgileri; " + user.getFirstName() +" " + user.getLastName() + " " + user.getEmail() + " " + user.getPassword() +" olarak güncellendi.");
    }
}
