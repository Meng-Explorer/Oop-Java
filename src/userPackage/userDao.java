package userPackage;

import java.util.UUID;

public class userDao {
        // this place write to connect database ,save ,get and bring data from database
    private static user[] users ;
    static {
        users = new user[]{
                new user(UUID.randomUUID(),"MengLang"),
                new user(UUID.randomUUID(),"Mengly"),
                new user(UUID.randomUUID(),"Nimol"),
                new user(UUID.randomUUID(),"July")
        };
    }

    public static user[] getUser() {
        return users;
    }
}
