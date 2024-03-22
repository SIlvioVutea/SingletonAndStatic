import java.util.Optional;

public class User {
    private String name;
    private Integer age;
    private final static User instance = new User("Paolo", 15);

    public static User getInstance() {
        return instance;
    }

    private User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printUser(User user) {
        System.out.println("name and age : " + user.getName() + ", " + user.getAge());
    }
}
