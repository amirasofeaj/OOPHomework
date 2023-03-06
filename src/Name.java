public class Name {

    private String fname;
    private String lname;
    private String mname;

    // a constructor
    // no return, name same as class
    public Name(){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    //SET
    public void setFname(String fname){
        this.fname = fname; //'this' refers to class attributes (on line 4)
    }

    public void setMname(String mname){
        this.mname = mname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    //GET
    public String getFname(){
        return fname;
    }

    public String getMname(){
        return mname;
    }

    public String getLname(){
        return lname;
    }

}
