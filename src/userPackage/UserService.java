package userPackage;

import java.util.UUID;

public class UserService  {


    public user[] getUser(){
        return  userDao.getUser();
    }
    public user getUserById(UUID Id){
        for (user user: getUser()){
            if(user.getId().equals(Id)){
                return user;
            }
        }
        return null;
    }
}
