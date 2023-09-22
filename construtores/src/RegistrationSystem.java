public class RegistrationSystem {
    public static void main(String[] args) {
        Person dino = new Person("Fellipe", "99999999999");
        //Definindo o endereço
        dino.setAdress("Rua José Bezerril");

        System.out.println(dino.getName() + "-" + dino.getCpf());
    }
}
