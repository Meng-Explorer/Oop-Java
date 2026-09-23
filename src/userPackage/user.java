package userPackage;

import java.util.UUID;

public class user {
    private String name;
    private UUID Id;
    public user(UUID Id, String name){
       this.Id = Id;
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "User:" + "name:'" + name + '\'' + ", Id:" + Id ;
    }
}
