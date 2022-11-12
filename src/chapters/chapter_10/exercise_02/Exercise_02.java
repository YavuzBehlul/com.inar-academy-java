package chapters.chapter_10.exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi_yvz = new BMI("Yavuz",25,209,70);
        System.out.println("The BMI for " + bmi_yvz.getName()+" is " +
                 bmi_yvz.getBMI() +" " + bmi_yvz.getStatus());
    }

}
