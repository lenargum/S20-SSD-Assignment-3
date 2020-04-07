package project11;

public class BeautifulBasementDecorator extends SearchPageDecorator {

	@Override
	public void render() {
		/* Render basement */
		wrappee.render();
	}

}
