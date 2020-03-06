package project11;

import java.util.List;

public class Admin extends User {
    List<Website> hostedWebsites;

    public List<Website> getHostedWebsites() {
        return hostedWebsites;
    }

    public void setHostedWebsites(List<Website> hostedWebsites) {
        this.hostedWebsites = hostedWebsites;
    }

    public void addWebsite(Website website) {
        hostedWebsites.add(website);
    }

    public Suggestion requestSuggestion(Website website) {
        return null;
    }
}
