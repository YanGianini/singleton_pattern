

public class GmailCredentials {

    private GmailCredentials() {};
    private static GmailCredentials instance = new GmailCredentials();
    public static GmailCredentials getInstance() { return instance;};

    private String user;
    private String password;
    private String appKey;

    public String getUser() {
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getAppKey(){
        return appKey;
    }

    public void setAppKey(String appKey){
        this.appKey = appKey;
    }
}
