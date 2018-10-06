package t3.ads.user;
import t3.object.UserObject;
import t3.ads.*;

public interface User extends ShareControl{
    public boolean addUser(UserObject item);
    public boolean editUser(UserObject item);
    public boolean delUser(UserObject item);
}
