package Singleton;
public class Configuration{
    private String applicationName;
    private String databaseUrl;
    private int serverPort;
    private Configuration(String applicationName,String databaseUrl,int serverPort){
        this.applicationName=applicationName;
        this.databaseUrl=databaseUrl;
        this.serverPort=serverPort;
    }
    private static Configuration singleInstance;
    public void setApplicationName(String applicationName){
        this.applicationName=applicationName;
    }
    public void setDatabaseUrl(String databaseUrl){
        this.databaseUrl=databaseUrl;
    }
    public void setServerPort(int serverPort){
        this.serverPort=serverPort;
    }
    public String getApplicationName(){
        return applicationName;
    }
    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public int getServerPort(){
        return serverPort;
    }
    public static Configuration getInstance(String applicationName,String databaseUrl,int serverPort){
        if(singleInstance==null){
            singleInstance=new Configuration(applicationName,databaseUrl,serverPort);
        }
        return singleInstance;
    }
}