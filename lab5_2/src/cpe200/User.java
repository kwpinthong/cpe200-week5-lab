package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public String setUserName(String name) {
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(!name.matches(regex)){
            throw new RuntimeException();
        }else{
            String old_name = userName;
            this.userName = name;
            return old_name;
        }
    }

    public int setPassword(String name) {
        String regex = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(name.matches(regex)){
            this.password = name;
            return name.length();
        }else{
            throw new RuntimeException();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
