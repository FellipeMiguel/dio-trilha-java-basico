public class Person {
    private final String name;
    private final String cpf;
    private String adress;

    // Construtor
    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // get e set
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String newAdress) {
        this.adress = newAdress;
    }
}
