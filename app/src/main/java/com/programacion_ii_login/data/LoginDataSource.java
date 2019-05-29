package com.programacion_ii_login.data;

import com.programacion_ii_login.data.model.LoggedInUser;
import com.programacion_ii_login.data.model.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    private Map<String, User> users = new HashMap<>();

    public LoginDataSource() {
        this.users.put("jfelix", new User(1,"José Félix" , "123"));
        this.users.put("adrimota", new User(2, "Adriana Mota", "cookieland"));
        this.users.put("josegr88", new User(3, "José Germán", "secreto"));
    }

    public Result<LoggedInUser> login(String username, String password) {

        try {
            if(users.containsKey(username)){
                User user = users.get(username);

                if (user.getPassword() == password) {
                    LoggedInUser loggedInUser = new LoggedInUser(user.getUserId(), user.getDisplayName());
                    return new Result.Success<>(loggedInUser);
                }
            }

            return  new Result.Error(new IOException("Could'nt find user", new NullPointerException()));
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));

        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
