package random;
import java.util.*;

public class random {

	public static void main(String[] args) {

	 Scanner s = new Scanner (System.in);
	 char ch ;

	 do {
	 System.out.println("1 : input score to check grade");
	 System.out.println("2 : input grade to show score");
	 System.out.println("0 : exit");

	 /////////////////////////////////////////////////////

	 ch = s.next().charAt(0);
	 	switch (ch) {
	 	case '1' : System.out.print("enter score :");
	 			   int score = 0;
	 			   score = s.nextInt();
	 			   if (score>=80&&score<=100) {
	 				  System.out.println("A :grade");
	 			   }
	 			   else if (score>=70&&score<=79) {
		 				  System.out.println("B :grade");
		 			   }
	 			   else if (score>=60&&score<=69){
	 				  System.out.println("C :grade");
	 			   }
	 			   else if (score>=50&&score<59){
	 				  System.out.println("D :grade");
	 			   } else  System.out.print("F :grade");
	 			   	 break;

	 	case '2'  : System.out.print("enter grade :");
	 				char g;
	 				g = s.next().charAt(0);
	 				if (g == 'a'){
	 					g= 'A';
	 				} if (g=='b'){
	 					g='B';
	 				} if (g=='c'){
	 					g = 'C';
	 				} if (g=='d'){
	 					g = 'D' ;
	 				} if (g=='f'){
	 					g ='F';	 				}
	 				switch (g){
	 				case 'A' :    System.out.println("80-100"); break;
	 				case 'B' :     System.out.println("70-79");break;
	 				case 'C' :   System.out.println("60-69");  break;
	 				case 'D' :  System.out.println("50-59");break;
	 				case 'F' :	 System.out.println("0-49");  break;
	 				}//end
	 	case '0'  : System.out.print("Exit"); break;
	 	}//end switch

	 }while (ch !='0');
  }
}
