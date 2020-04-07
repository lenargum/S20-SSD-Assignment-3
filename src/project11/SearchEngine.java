package project11;

public class SearchEngine {

    public SearchPage search(String request) {
        SearchPageBuilder builder = new SearchPageBuilder();

        builder.addWebsite(new Website("url1", "title", 1.0));
        builder.addWebsite(new Website("url2", "title", 2.0));
        builder.addWebsite(new Website("url3", "title", 3.0));
        builder.addWebsite(new Website("url4", "title", 4.0));
        builder.sortByRank(false);
        builder.hideWebsitesWithSmallKeywords(10);

        return builder.getResult();
    }
}
