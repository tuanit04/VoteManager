package t3.ads;
import java.sql.*;

public interface ConnectionPool {
    public Connection getConnection(String objectname) throws SQLException;
    public void releaseConnection(String objectname, Connection con) throws SQLException;
}
