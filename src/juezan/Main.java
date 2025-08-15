
package juezan;

import banking.banking;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        banking bApp[] = new banking[10];
        int accountCount = 0; 
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;
        switch(choice){
            case 1:
              do{
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.print("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                        if(accountCount < bApp.length) {
                            bApp[accountCount] = new banking();
                            System.out.print("Enter Account No.: ");
                            bApp[accountCount].setAccountNo(sc.nextInt());
                            System.out.print("Enter Account Pin: ");
                            bApp[accountCount].setPin(sc.nextInt());
                            System.out.println("Account Registered Successfully!");
                            accountCount++;
                        } else {
                            System.out.println("Account limit reached!");
                        }
                        break;
                        
                    case 2:
                        System.out.print("Enter your Account No: ");
                        int accountNo = sc.nextInt();
                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();
                        
                        boolean found = false;
                        for(int i = 0; i < accountCount; i++) {
                            if(bApp[i].verifyAccount(accountNo, pin)) {
                                found = true;
                                break;
                            }
                        }
                        
                        if(found) {
                            System.out.println("Login Successful!");
                        } else {
                            System.out.println("Invalid account!");
                        }
                        break;
                        
                    case 3:
                        if(accountCount == 0) {
                            System.out.println("No registered accounts.");
                        } else {
                            System.out.println("\n--- Registered Accounts ---");
                            for(int i = 0; i < accountCount; i++) {
                                System.out.println("Account No.: " + bApp[i].getAccountNo());
                            }
                        }
                        break;
                        
                    default:
                        System.out.println("Invalid selection!");
                }
                
                System.out.print("\nDo you want to continue? (1/0): ");
                resp = sc.nextInt();
              } while(resp == 1);
                
                break;
            case 2:
          
                break;
            case 3:
          
                break;
            default:
                System.out.println("Invalid Selection!");
        }
    
    }
}

