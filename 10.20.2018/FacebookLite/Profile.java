public class Profile {
    private User u;
    private Friend f;
    private Post p;
    
    public Profile(String fname, String lname, int age) {
        u = new User(fname, lname, age);
        f = new Friend();
        p = new Post();
    }
    public void printProfile() {
        u.display();
        f.display();
        p.display();
    }
    public void setStatus(String status) {
        u.setStatus(status);
    }
    public void togglePosts() {
        p.toggleVisibility();
    }
}
