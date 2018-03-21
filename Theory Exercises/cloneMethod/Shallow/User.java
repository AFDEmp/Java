public class User implements Cloneable{

    private int userNo;
    private String userName;
    private Story story;

    public User(int userNo, String userName, Story story) {
		this.userNo = userNo;
		this.userName = userName;
		this.story = story;
        System.out.println("User Constructor Called");
	}

    //getters and setters
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userName=" + userName + ", story=" + story + "]";
	}

}