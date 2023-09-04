public class Login {
private static  Login loginInstance=new Login();
    private Login() {
    }
    public static Login getLoginInstance() {
        return loginInstance;
    }

    public boolean authenticate(String username, String password) {
        for (User user : SLFile.users)
        {
            if (user.getUserName().equals(username) && user.getPassword().equals(password))
            {
                return  true;
            }
        }
        return false;
    }
}

