package application.loginpage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Pair;

public class Mvc {
    private String myPassword;
    private String myUserName;

    public void setMyPassword( String myPassword){

        this.myPassword=myPassword;

    }
    public void setMyUserName(String myUserName){
        this.myUserName=myUserName;

    }
 public String getMyPassword(){
        return myPassword;

 }


    public String getMyUserName() {
        return myUserName;
    }
}




