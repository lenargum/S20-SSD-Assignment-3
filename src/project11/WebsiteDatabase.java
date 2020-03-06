package project11;

import java.util.List;

class WebsiteDatabaseSingleton {
    private static WebsiteDatabaseSingleton obj;

    private WebsiteDatabaseSingleton(){}

    public static WebsiteDatabaseSingleton getInstance(){
        if(obj==null){
            obj = new WebsiteDatabaseSingleton(); }
        return obj;
    }

    public void storeWebsite(Website website) {

    }

    public void removeWebsite(Website website) {

    }

    public Website getWebsite(Website website){
        return null; // todo
    }

    public void updateWebsite(Website website){

    }
}
