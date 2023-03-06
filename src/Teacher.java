// createed by team in Bangalore
public class Teacher {

    // - DATA / ATTRTIBUTES
    String name;
    String ic;
    String address;
    String numyearexp;
    String qualification;

    // - METHODS / OPERATIONS

    //SET
    public void setName(String name){
        this.name = name;
    }

    public void setIC(String ic){
        this.ic = ic;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setNumYearExp(String numyearexp){
        this.numyearexp = numyearexp;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    //GET
    public String getName(){
        System.out.println("Teacher Name: " + name);
        return name;
    }

    public String getIC(){
        System.out.println("IC Number: " + ic);
        return ic;
    }

    public String getAddress(){
        System.out.println("Address: " + address);
        return address;
    }

    public String getNumYearExp(){
        System.out.println("Years of Experience: " + numyearexp + " years");
        return numyearexp;
    }

    public String getQualification(){
        System.out.println("Qualification: " + qualification);
        return qualification;
    }

}
