public class Student {

    // - DATA / ATTRTIBUTES
    Name name; //big name is like declare or struct. (taken from file name)
    String kp;
    String address;
    String schoolname;
    private float marks[] = new float[5];

    // - CONSTRUCTOR
    public Student(){
        System.out.println();
    }

    // - METHODS / OPERATIONS

    //SET
    public void setName(Name name) {
        this.name = name;
    }

    public void setKP(String kp){
        this.kp = kp;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSchoolName(String schoolname){
        this.schoolname = schoolname;
    }

    //GET
    public Name getName(){
        System.out.println("Student Name: " + name);
        return name;
    }

    public String getKP(){
        System.out.println("IC Number: " + kp);
        return kp;
    }

    public String getAddress(){
        System.out.println("Address: " + address);
        return address;
    }

    public String getSchoolName(){
        System.out.println("School Name: " + schoolname);
        return schoolname;
    }


    //CALCULATIONS
    public float calcAvg() {
        float sum = 0;
        float avg = 0;

        for (int i = 0; i < 5; i++){
            sum += marks[i];
        }
        avg = sum/5;
        return avg;
    }

    public float calcMin(){
        float min = 999;

        for (int i = 0; i < marks.length; i++){
            if (marks[i] < min)
                min = marks[i];
        }
        return min;
    }

    public void setMark(float mark, int i) {
        marks[i] = mark;
    }

    void displayMarks(){
        //print the marks
        for (int i = 0; i < marks.length; i++){
            System.out.println("Marks at index " + i + ":" + marks[i]);
        }
    }

}
