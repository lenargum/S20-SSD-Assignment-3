package project11;

public class RelevantPicturesDecorator extends SearchPageDecorator {

	@Override
	public void render() {
		/* Render pictures */
		wrappee.render();
	}

}
