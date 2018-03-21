public class Story {

    private String storyName;

    public Story(String storyName) {
		this.storyName = storyName;
        System.out.println("Story Constructor");
	}

    @Override
    public String toString() {
        return "Story [storyName=" + storyName + "]";
    }
}