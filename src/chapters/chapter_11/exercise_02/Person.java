package chapters.chapter_11.exercise_02;

public class Person {
    private String name;
    private String adress;
    private String phoneNumber;
    private String e_mail;
    public Person() {
        this(null, null, null, null);
    }

    public Person(String name, String adress, String phoneNumber, String e_mail) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.e_mail = e_mail;
    }

    public String getName() {
        return this.name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getE_mail() {
        return this.e_mail;
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nAdress : " + this.adress +
                "\nPhone Number : " + this.phoneNumber +
                "\ne-mail Adress : " + this.e_mail;
    }
}
