package project11;

public class SearchEngine {

	private ISearchStrategy strategy;

    public SearchPage search(String request) {
    	if(request.contains("popular") || request.contains("most visited")) {
    		this.setStrategy(new MostVisitedPagesSearchStrategy());
		} else if (request.contains("rarely visited")) {
    		this.setStrategy(new RarelyVisitedPagesSearchStrategy());
		} else {
    		this.setStrategy(new MostVisitedPagesSearchStrategy());
		}

		return strategy.search(request);
    }

	private void setStrategy(ISearchStrategy newStrategy) {
		this.strategy = newStrategy;
	}
}
