package chapters.chapter_11.exercise_02;

public class Faculty extends Employee{
    private int officeHour;
    private int rank;

    public Faculty() {

    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, int officeHour, int rank){
        super(name, address, phoneNumber, email, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice Hour : " + this.officeHour + "\nRank = " + this.rank;
    }
}
