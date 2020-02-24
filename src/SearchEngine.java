public class SearchEngine {

    public SearchPage search(String request) {

        SearchPageBuilder builder = new SearchPageBuilder();

        builder.addWebsite(new Website("url1", "title1", 228.0));
        builder.addWebsite(new Website("url2", "title2", 322.0));
        builder.addWebsite(new Website("url3", "title3", 123.0));
        builder.addWebsite(new Website("url4", "title4", 456.0));
        builder.sortByRank(false);
        builder.hideWebsitesWithSmallKeywords(10);
        
        return builder.getResult();

    }
}
