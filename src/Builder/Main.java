package Builder;

public class Main {

    public static void main(String[] args) {
        User user = User.Builder.builder()
                .setName("Ardi")
                .setSurname("Jorganxhi")
                .build();

        System.out.println(user.toString());
    }
}
