package t3.ads.user;

import t3.ads.ConnectionPool;
import t3.object.UserObject;
import t3.ads.basic.BasicImpl;

public class UserImpl extends BasicImpl implements User {
    public UserImpl() {
    }

    /**
     * addUser
     *
     * @param item UserObject
     * @return boolean
     * @todo Implement this t3.ads.user.User method
     */
    public boolean addUser(UserObject item) {
        return false;
    }

    /**
     * delUser
     *
     * @param item UserObject
     * @return boolean
     * @todo Implement this t3.ads.user.User method
     */
    public boolean delUser(UserObject item) {
        return false;
    }

    /**
     * editUser
     *
     * @param item UserObject
     * @return boolean
     * @todo Implement this t3.ads.user.User method
     */
    public boolean editUser(UserObject item) {
        return false;
    }

    /**
     * getCp
     *
     * @return ConnectionPool
     * @todo Implement this t3.ads.ShareControl method
     */
    public ConnectionPool getCp() {
        return null;
    }

    /**
     * releaseConnection
     *
     * @todo Implement this t3.ads.ShareControl method
     */
    public void releaseConnection() {
    }
}
