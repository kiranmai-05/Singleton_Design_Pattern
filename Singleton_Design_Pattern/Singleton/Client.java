package Singleton;
public class Client{
    public static void main(String args[]){
        Configuration obj1=Configuration.getInstance("Instagram","jdbc:mysql://localhost:3306/mydb/",800);
        Configuration obj2=Configuration.getInstance("Whatsapp","jdbc:sql://localhost:3306/mydb1/",900);
        System.out.println("Application Name: "+obj1.getApplicationName());
        System.out.println("Dtabase url: "+obj1.getDatabaseUrl());
        System.out.println("Server port: "+obj1.getServerPort());
        if(obj1==obj2){
            System.out.println("True");
        }
    }
}