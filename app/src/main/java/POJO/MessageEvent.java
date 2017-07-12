package POJO;

/**
 * Created by anuja on 7/13/17.
 */

public class MessageEvent {
    public String name;
    public String email;

    public MessageEvent(String name,String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



}
