package project11;

public class SearchPageBuilder {

    private SearchPage pageToBuild;

    public SearchPageBuilder() {
        pageToBuild = new SearchPage();
    }

    public void addWebsite(Website website) {
        pageToBuild.getUrls().add(website);
    }

    public SearchPage getResult() {
        return pageToBuild;
    }

    public void sortByRank(boolean isBackward) { }

    public void hideWebsitesWithSmallKeywords(int keywordsNum) { }
}