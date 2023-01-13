public class Student extends Person {
    private double gpa;

    public Student() {
        super("", "");
    }

    public Student(final String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;

    }


    @Override
    public double getPaymentAmount() {
        if (getGpa() > 2.67)
            return 36660.0;
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.getId() + ". " + super.getName() + " " + super.getSurname() +
                ", gpa = " + gpa + ", earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public int compareTo(Person o) {

        return (int)(getPaymentAmount() - o.getPaymentAmount());
    }
}
