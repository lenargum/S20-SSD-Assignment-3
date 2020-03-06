package project11;

public class SearchEngine {

    public SearchPage search(String request) {
        SearchPageBuilder builder = new SearchPageBuilder();

        builder.addWebsite(Website.FromURL("url1"));
        builder.addWebsite(Website.FromURL("url2"));
        builder.addWebsite(Website.FromURL("url3"));
        builder.addWebsite(Website.FromURL("url4"));
        builder.sortByRank(false);
        builder.hideWebsitesWithSmallKeywords(10);

        return builder.getResult();
    }
}
