import java.util.List;

public class Admin extends User {
    List<Website> hostedWebsites;

    public void addWebsite(Website website) {
        hostedWebsites.add(website);
    }

    public Suggestion requestSuggestion(Website website) {
        return null;
    }
}
