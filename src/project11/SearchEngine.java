package project11;

public class SearchEngine {

	private ISearchStrategy strategy;

    public SearchPage search(String request) {
		return strategy.search(request);
    }

	public void SetStrategy(ISearchStrategy newStrategy) {
		strategy = newStrategy;
	}
}
