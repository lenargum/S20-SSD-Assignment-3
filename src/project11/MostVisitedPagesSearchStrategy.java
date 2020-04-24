package project11;

import java.util.ArrayList;

public class MostVisitedPagesSearchStrategy implements ISearchStrategy {

	public MostVisitedPagesSearchStrategy() {
	
	}

	@Override
	public SearchPage search(String request) {
		
		SearchPage assembledPage;

		assembledPage = findMostVisitedPages(request); 

		return assembledPage;
	}

	private SearchPage findMostVisitedPages(String request) {

		SearchPage searchPage = new SearchPage();
		searchPage.setUrls(new ArrayList<>() /* get urls */); // Algorithm for collecting of rarely visited pages
		
		return searchPage;
	}

}
