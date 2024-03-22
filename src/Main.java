import java.util.Optional;

public class Main {
    //    Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//    All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//    Creare 2 oggetti User di cui creerà un'istanza.
//    Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
    public static void main(String[] args) {

        User user1 = User.getInstance();
        User.printUser(user1);
        User user2 = User.getInstance();
        user2.setName("Piera");
        user2.setAge(52);
        User.printUser(user1);
        User.printUser(user2);

//        User user1 = new User(Optional.empty(),Optional.empty());
//        User user2 = new User(Optional.empty(),Optional.empty());
//
//        User.printUser(user1);
//
//        user2.setAge(22);
//        user2.setName("Piera");
//
//
//        User.printUser(user2);


    }
}