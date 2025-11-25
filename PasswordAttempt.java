import java.util.Scanner;

public class PasswordAttempt {
  public static void main(String args[]) {
   
   Scanner scanner = new Scanner(System.in);
   var Attempt = 1;
   
   do {
       System.out.println("Masukan Password: ");
       var Password = scanner.nextLine();
       Attempt++;
       if(Password.equalsIgnoreCase("Admin")) {
        System.out.println("Anda berhasil login");
        break;
       }else if (Attempt > 3) {
           System.out.println("Akun Terkunci");
           break;
       } else {
           System.out.println("Coba lagi");
       }
       }while (Attempt <= 3);
       
       scanner.close();
       
  }
}