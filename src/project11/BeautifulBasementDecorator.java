package project11;

public class BeautifulBasementDecorator extends SearchPageDecorator {

	public BeautifulBasementDecorator(IWebPage objToDecore) {
		super(objToDecore);
	}

	@Override
	public void render() {
		/* Render basement */
		wrappee.render();
	}

}
