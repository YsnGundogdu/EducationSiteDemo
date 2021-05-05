public class UserManager {
    public void createAccount(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı kayıt oldu");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " kullanıcısının kaydı silindi");
    }

    public void signIn(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı giriş yaptı");
    }

    public void logOut(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı çıkış yaptı");
    }

    public void profileEdit(User user) {
        System.out.println(user.getFirstName() + " kullanısının bilgileri güncellendi");
    }
}
