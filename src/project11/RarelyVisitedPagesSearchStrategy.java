package project11;

import java.util.ArrayList;

public class RarelyVisitedPagesSearchStrategy implements ISearchStrategy {

	public RarelyVisitedPagesSearchStrategy() {
	
	}

	@Override
	public SearchPage search(String request) {
		
		SearchPage assembledPage;

		assembledPage = findRarelyVisitedPages(request); 

		return assembledPage;
	}

	private SearchPage findRarelyVisitedPages(String request) {

		SearchPage searchPage = new SearchPage();
		searchPage.setUrls(new ArrayList<>() /* get urls */); // Algorithm for collecting of rarely visited pages
		
		return searchPage;
	}

}
