package project11;

import java.util.ArrayList;
import java.util.List;

public class SearchPage implements IWebPage {

    private List<Website> urls;

    public SearchPage() {
        urls = new ArrayList<>();
    }

    public List<Website> getUrls() {
        return urls;
    }

	@Override
	public void render() {
		/* Basic page rendering */
	}

}
