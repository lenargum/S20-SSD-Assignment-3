package project11;

public class FancyBoundariesDecorator extends SearchPageDecorator {

	public FancyBoundariesDecorator(IWebPage objToDecore) {
		super(objToDecore);
	}

	@Override
	public void render() {
		/* Render boundaries */
		wrappee.render();
	}

}
