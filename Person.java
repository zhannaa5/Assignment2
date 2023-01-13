public class Person implements Payable, Comparable<Person>{
    private int id;
    private static int id_g = 1;
    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = id_g++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public double getPaymentAmount() {
     return 0;
    }

    @Override
    public int compareTo(Person o) {
        return (int) o.getPaymentAmount();
    }
}
