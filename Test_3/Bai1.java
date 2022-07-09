
import java.util.Scanner;
public class Bai1 {
    
     public static void main(String[] args) {
    	 int number;
    	 int number2;
    	 String giatri;
    	 int kq,result;
    	 
    	 
    	 Scanner sc= new Scanner (System.in);
    	 System.out.print("number: ");
    	 number= sc.nextInt();
    	 giatri= sc.nextLine();
    	 
    	 System.out.print("number2 :");
    	 number2= sc.nextInt();
    	 giatri= sc.nextLine();
    	 
    	 System.out.print("gia tri: ");
    	 giatri= sc.nextLine();
    	 
    	 
////    	 System.out.println(number); 
//    	 while(number<=number2) {
//    		 for(int j=number2-number;j>=1;j--) System.out.print(" ");
//        	 for(int i=1;i<=number;i++) System.out.print(i);
//        	 System.out.println();
//        	 number++;
//         }
    	 kq=number2-number+1;
    	 result= (int)(Math.random()*kq)+number;
//    	 
    	 int yourNumber =0;
    	 while (result !=yourNumber) {
    		 System.out.print("nhap so ban chon: ");
    		 yourNumber= sc.nextInt();
    		 if(yourNumber<kq) {
    			 System.out.println("so nhap nho hon roi");
    		 }
    		 else if(yourNumber>kq) {
    			 System.out.println("so nhap lon hon roi");
    		 }
    		 else {
    			 System.out.println("chuan luon");
    		 }
    	 }
    	 sc.close();
    	 
    	 
    	 
		
	}
}
