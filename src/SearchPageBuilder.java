public class SearchPageBuilder {
	
	private SearchPage pageToBuild;

	public void addWebsite(Website website) {}
	public void sortByRank(boolean isBackward) {}
	public void hideWebsitesWithSmallKeywords(int keywordsNum) {}

	public SearchPage getResult() {
		return pageToBuild;
	}

}
