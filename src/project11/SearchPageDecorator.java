package project11;

public class SearchPageDecorator implements IWebPage {

	protected IWebPage wrappee;

	public SearchPageDecorator(IWebPage objToDecore) {
		wrappee = objToDecore;
	}

	@Override
	public void render() {
		/* ... */
	}

}
