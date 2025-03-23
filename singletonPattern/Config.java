package singletonPattern;

public class Config {
    private String server;
    private int port;

    public static Config INSTANCE = null;

    private Config() {

    }

    //lazy
    synchronized public static Config getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Config();
        }
        return INSTANCE;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getServer() {
        return server;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}
