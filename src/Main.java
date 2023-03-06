import java.util.*;
public class Main
{
    // application code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1) STUDENTS

        //names
        Student mike = new Student();
        Name michael = new Name(); //'new' means create something new
        michael.setFname("Michael");
        michael.setMname("Learns to");
        michael.setLname("Rock");
        mike.setName(michael);

        Student adila = new Student();
        Name adlin = new Name();
        adlin.setFname("Adlin");
        adlin.setMname("binti");
        adlin.setLname("Izzat");
        adila.setName(adlin);

        Student imran = new Student();
        Name syed = new Name();
        syed.setFname("Syed");
        syed.setMname("Imran");
        syed.setLname("Shah");
        imran.setName(syed);

        //kp
        mike.setKP("030122140598");
        adila.setKP("031209021192");
        imran.setKP("030423100302");

        //address
        mike.setAddress("Kuala Lumpur");
        adila.setAddress("Kedah");
        imran.setAddress("Selangor");

        //schoolname
        mike.setSchoolName("SAB");
        adila.setSchoolName("SMKK");
        imran.setSchoolName("SMKTM");


        // 2) TEACHERS
        Teacher cikguminah = new Teacher();
        cikguminah.setName("Nur Minah binti Khairy");
        cikguminah.setIC("890317101493");
        cikguminah.setAddress("Selangor");
        cikguminah.setNumYearExp("5");
        cikguminah.setQualification("Qualified");

        for (int i=0; i<5; i++)
            mike.setMark(100, i);

        //student marks
        mike.setMark(98, 0);
        mike.setMark(58, 1);
        mike.setMark(55, 2);
        mike.setMark(86, 3);
        mike.setMark(74, 4);

        adila.setMark(77, 0);
        adila.setMark(56, 1);
        adila.setMark(40, 2);
        adila.setMark(88, 3);
        adila.setMark(93, 4);

        imran.setMark(45, 0);
        imran.setMark(86, 1);
        imran.setMark(55, 2);
        imran.setMark(67, 3);
        imran.setMark(44, 4);


        //PRINT OUTPUT
        System.out.println("WELCOME TO PANDAI SDN BHD!");
        System.out.println("**************************");
        System.out.println();
        System.out.print("ENTER NAME OF TUITION CENTER: ");
        String tuitionName = input.nextLine();
        System.out.print("ENTER NAME TO CHECK THEIR INFOs: ");
        String infoName = input.nextLine();


        switch(infoName){
            case "Michael":
                System.out.println();
                System.out.println("===== STUDENT INFO =====");
                System.out.println("Student Name: " + michael.getFname() + " " + michael.getMname() + " " + michael.getLname());
                mike.getKP();
                mike.getAddress();
                mike.getSchoolName();

                //Student mark
                System.out.println();
                System.out.println("===== STUDENT MARKS =====");
                mike.displayMarks();

                //Average and Minimum mark for student
                System.out.println();
                System.out.println("Average mark = " + mike.calcAvg());
                System.out.println("Minimum mark = " + mike.calcMin());
                break;

            case "Adlin":
                System.out.println();
                System.out.println("===== STUDENT INFO =====");
                System.out.println("Student Name: " + adlin.getFname() + " " + adlin.getMname() + " " + adlin.getLname());
                adila.getKP();
                adila.getAddress();
                adila.getSchoolName();

                //Student mark
                System.out.println();
                System.out.println("===== STUDENT MARKS =====");
                adila.displayMarks();

                //Average and Minimum mark for student
                System.out.println();
                System.out.println("Average mark = " + adila.calcAvg());
                System.out.println("Minimum mark = " + adila.calcMin());
                break;

            case "Syed":
                System.out.println();
                System.out.println("===== STUDENT INFO =====");
                System.out.println("Student Name: " + syed.getFname() + " " + syed.getMname() + " " + syed.getLname());
                imran.getKP();
                imran.getAddress();
                imran.getSchoolName();

                //Student mark
                System.out.println();
                System.out.println("===== STUDENT MARKS =====");
                imran.displayMarks();

                //Average and Minimum mark for student
                System.out.println();
                System.out.println("Average mark = " + imran.calcAvg());
                System.out.println("Minimum mark = " + imran.calcMin());
                break;

            case "Minah":
                System.out.println();
                System.out.println("===== TEACHER INFO =====");
                cikguminah.getName();
                cikguminah.getIC();
                cikguminah.getAddress();
                cikguminah.getNumYearExp();
                cikguminah.getQualification();
                break;
        }

    }
}