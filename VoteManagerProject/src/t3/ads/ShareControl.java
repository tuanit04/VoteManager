package t3.ads;

public interface ShareControl {
    public ConnectionPool getCp();
    public void releaseConnection();
}
