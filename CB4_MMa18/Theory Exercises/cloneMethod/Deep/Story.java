public class Story implements Cloneable{

    private String storyName;

    public Story(String storyName) {
		this.storyName = storyName;
        System.out.println("Story Constructor");
	}
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Story [storyName=" + storyName + "]";
    }
}