package project11;

public class RelevantPicturesDecorator extends SearchPageDecorator {

	public RelevantPicturesDecorator(IWebPage objToDecore) {
		super(objToDecore);
	}

	@Override
	public void render() {
		/* Render pictures */
		wrappee.render();
	}

}
