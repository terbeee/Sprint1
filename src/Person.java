/**
 * @author Admin
 * @date 20/10/2023
 * @project sprint1
 */
public class Person {
    public static void main(String[] args) {
        Person Toby = new Person("Toby", "McCrae",2001);
        Person Lauren = new Person("Lauren", "White", 2000);

        System.out.println(Toby);
        System.out.println(Lauren);
    }
    private String fName;
    private String lName;
    private int year;


    private static int counter;

    public Person(String fName, String lName, int year){
        this.fName = fName;
        this.lName = lName;
        this.year = year;
        counter++;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge(){
        return (2023 - year);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + getAge() + '\'' +
                "counter=" + counter;
    }
}
