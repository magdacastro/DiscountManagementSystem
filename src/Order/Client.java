package Order;

public class Client {
    private String name;
    private int age;
    private boolean isDisabledPerson;

    public Client(String name, int age, boolean isDisabledPerson) {
        this.name = name;
        this.age = age;
        this.isDisabledPerson = isDisabledPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeClient() {
        if (this.isDisabledPerson()) {
            return "Pessoa com deficiência";
        } else if(this.getAge() >= 6 && this.getAge() <= 18) {
           return "Estudante";
        } else if(this.getAge() > 18 && this.getAge() < 60){
            return "Regular";
        } else if(this.getAge() >= 60){
            return "Idoso";
        } else {
            return "Regular";
        }
    }

    public boolean isDisabledPerson() {
        return isDisabledPerson;
    }

    public void setDisabledPerson(boolean disabledPerson) {
        isDisabledPerson = disabledPerson;
    }
}
