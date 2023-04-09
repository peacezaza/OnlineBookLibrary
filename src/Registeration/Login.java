package Registeration;

import java.util.ArrayList;

public class Login{
    private String username;
    private String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean checkLogin(ArrayList<Register> registers){
        boolean correct = false;
        for (Register register : registers) {
            if(register.getUsername().equals(this.username) && register.getPassword().equals(this.password)){
                correct = true;
            }
        }
        return correct;
    }


}
