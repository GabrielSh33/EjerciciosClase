package GenericClass;

public class Principal {
    public static void main(String[] args) {
        ClaseG<String> gen1 = new ClaseG<>("Hola");
        System.out.println(gen1.getDato());

        Person p1 = new Person("Gabriel", 18,"M","Santiago Casandeje");
        ClaseG<Person> gen2= new ClaseG<>(p1);

    }
}
