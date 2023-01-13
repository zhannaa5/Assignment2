public class Employee extends Person{
    private String position;
    private double salary;


    public Employee(String name, String surname, String position, Double salary ){
        super(name, surname);
        setPosition(position);
        setSalary(salary);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
      return getSalary();
    }

    @Override
    public String toString() {
        return "Employee: " + super.getId() + ". "  + super.getName() + " " + super.getSurname() +
                ", " + position + ", earns " + salary + " tenge";
    }

    @Override
    public int compareTo(Person o) {

        return (int)(getPaymentAmount() - o.getPaymentAmount());
    }


}
