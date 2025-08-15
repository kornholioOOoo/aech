package banking;
import java.util.Scanner;

public class banking {
    private int accountNo;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getPin() {
        return pin;
    }

    public boolean verifyAccount(int acc, int pn){
        if(acc == accountNo && pn == pin){
            return true;
        }else{
            return false;
        }
    }
}