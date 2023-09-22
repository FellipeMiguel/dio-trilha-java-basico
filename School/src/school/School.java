package school;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Fellipe");
        student1.setAge(8);
        student1.setSex("Masculino");

        System.out.println("O aluno " + student1.getName() + " tem " + student1.getAge() + " anos");
    }
}
