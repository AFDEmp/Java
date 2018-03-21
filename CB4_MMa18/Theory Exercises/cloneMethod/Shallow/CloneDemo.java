public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Story story = new Story("Harry Potter");
        User user = new User(1,"Sridhar",story);

        User userCloned = (User) user.clone();
        System.out.println(user);
        System.out.println(userCloned);

        System.out.println(user.equals(userCloned));
    }

}
