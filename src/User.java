import java.util.Optional;

public class User {
    private Optional<String> name;
    private Optional<Integer> age;

    public User() {
        this.name = Optional.empty();
        this.age = Optional.empty();
    }

    public String getName() {
        return name.orElse("undefined");
    }

    public void setName(String name) {
        this.name = Optional.of(name);
    }

    public int getAge() {
        return age.orElse(0);
    }

    public void setAge(int age) {
        this.age = Optional.of(age);
    }

    public static void printUser(User user) {
        System.out.println("name and age : " + user.getName() + ", " + user.getAge());
    }
}
