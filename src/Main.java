public class Main {
    //    Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//    All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//    Creare 2 oggetti User di cui creerà un'istanza.
//    Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
    public static void main(String[] args) {

        User user1 = new User("Paola", 21);
        User user2 = new User("Chiara", 21);

        User.printUser(user1);

        user2.setAge(22);
        user2.setName("Piera");

        User.printUser(user2);


    }
}