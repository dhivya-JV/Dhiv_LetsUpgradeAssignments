
import java.util.Scanner;
class Cab {
	int fare;
	int d;
	
	public Cab(){
		fare = 50;
	}
	
	public Cab(int amount) {
		amount = fare;
	}
}




public class RideCab {
	public static void main (String args[]) {
		///Cab ob = new Cab();
		int cd; // Cab distance from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance of cab from the user:");
		/*ob.*/cd = sc.nextInt();
		if(/*ob.*/cd>5) {
			Cab ob = new Cab( 50+10*(cd-5));
			System.out.print("Enter the distance travelled: ");
			ob.d = sc.nextInt();
			ob.fare += 10*ob.d;
			System.out.print("Total fare: Rs"+ob.fare);
			
		}//Scope of ob ends here of if 
		else {
			Cab ob = new Cab();	
			System.out.print("Enter the distance travelled: ");
			ob.d = sc.nextInt();
			ob.fare += 10*ob.d;
			System.out.print("Total fare: Rs"+ob.fare);
		}// scope of ob ends here of else 
		/*ob.d = sc.nextInt();
		ob.fare += 10*ob.d;
		System.out.println("Total fare: Rs"+ob.fare);*/
	}
}