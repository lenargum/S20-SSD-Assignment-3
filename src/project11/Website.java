package project11;

public class Website {
    private String url;
    private String title;
    private Double rank;

    private String description;

    public Website(String url, String title, Double rank) {
        this.url = url;
        this.title = title;
        this.rank = rank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRank() {
        return rank;
    }

    public void updateRank(Double rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
