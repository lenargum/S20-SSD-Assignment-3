package project11;

public class SearchEngine {

    public SearchPage search(String request) {
		
		SearchPage page = new SearchPage();
		IWebPage finalPage = null;

		switch (request) {
			case "request1": {
				finalPage = new FancyBoundariesDecorator(
						new BeautifulBasementDecorator(
							new RelevantPicturesDecorator(page)
							)
						);
				break;
			}
			case "request2": {
				finalPage = new FancyBoundariesDecorator(
						new BeautifulBasementDecorator(page)
						);
				break;
			}
			default: {
				finalPage = page;
			}
		}
		
		return finalPage;

    }
}
