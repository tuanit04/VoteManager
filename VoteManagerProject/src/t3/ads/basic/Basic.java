package t3.ads.basic;
import java.sql.*;
import t3.ads.*;
public interface Basic extends ShareControl {
    public boolean add(PreparedStatement pre);
    public boolean edit(PreparedStatement pre);
    public boolean del(PreparedStatement pre);

    public ResultSet gets(String sql);
    public ResultSet get(String sql, int value);
    public ResultSet get(String sql, String username, String userpass);
    public ResultSet[] gets(String[] sqls);
}
