package t3.ads.basic;

import java.sql.*;
import t3.ads.*;
import t3.ads.ConnectionPool;

public class BasicImpl implements Basic {
    protected Connection con;
    private ConnectionPool cp;
    private String objectname;
    public BasicImpl(String objectname, ConnectionPool cp) {
        this.objectname = objectname;
        if(cp==null){
            cp = new ConnectionPoolImpl();
        }
        else{
            this.cp = cp;
        }
        try {
            this.con = cp.getConnection(this.objectname);
            if(con.getAutoCommit()){
                con.setAutoCommit(false);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * add
     *
     * @param pre PreparedStatement
     * @return boolean
     * @todo Implement this t3.ads.basic.Basic method
     */
    private boolean execute(PreparedStatement pre){
        return false;
    }
    public boolean add(PreparedStatement pre) {
        return false;
    }

    /**
     * del
     *
     * @param pre PreparedStatement
     * @return boolean
     * @todo Implement this t3.ads.basic.Basic method
     */
    public boolean del(PreparedStatement pre) {
        return false;
    }

    /**
     * edit
     *
     * @param pre PreparedStatement
     * @return boolean
     * @todo Implement this t3.ads.basic.Basic method
     */
    public boolean edit(PreparedStatement pre) {
        return false;
    }

    /**
     * get
     *
     * @param sql String
     * @param value int
     * @return ResultSet
     * @todo Implement this t3.ads.basic.Basic method
     */
    public ResultSet get(String sql, int value) {
        return null;
    }

    /**
     * get
     *
     * @param sql String
     * @param username String
     * @param userpass String
     * @return ResultSet
     * @todo Implement this t3.ads.basic.Basic method
     */
    public ResultSet get(String sql, String username, String userpass) {
        return null;
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
     * gets
     *
     * @param sqls String[]
     * @return ResultSet[]
     * @todo Implement this t3.ads.basic.Basic method
     */
    public ResultSet[] gets(String[] sqls) {
        return null;
    }

    /**
     * gets
     *
     * @param sql String
     * @return ResultSet
     * @todo Implement this t3.ads.basic.Basic method
     */
    public ResultSet gets(String sql) {
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
