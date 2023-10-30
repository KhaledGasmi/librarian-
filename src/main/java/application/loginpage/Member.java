package application.loginpage;

public class Member {
     int ID1;
     String name,classm,email;

    public Member(int ID1,String name,String classm,String email){
        this.ID1=ID1;
        this.name=name;
        this.classm=classm;
        this.email=email;
    }

    public void setID(int ID1) {
        this.ID1 = ID1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassm(String classm) {
        this.classm = classm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID1() {
        return ID1;
    }

    public String getName() {
        return name;
    }

    public String getClassm() {
        return classm;
    }

    public String getEmail() {
        return email;
    }
}
