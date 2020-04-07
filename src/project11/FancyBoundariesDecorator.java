package project11;

public class FancyBoundariesDecorator extends SearchPageDecorator {

	@Override
	public void render() {
		/* Render boundaries */
		wrappee.render();
	}

}
