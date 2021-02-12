package TcsILP;
import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int reg1,reg2,reg3,reg4,price1,price2,price3,price4;
		String agen1,agen2,agen3,agen4,pac1,pac2,pac3,pac4;
		boolean f1,f2,f4,f3;
		System.out.println("ENTER THE DETAILS "+"\n");
		
		reg1=sc.nextInt();
		sc.nextLine();
		agen1=sc.nextLine();
		pac1=sc.nextLine();
		price1=sc.nextInt();
		f1=sc.nextBoolean();
		sc.nextLine();
		
		
		reg2=sc.nextInt();
		sc.nextLine();
		agen2=sc.nextLine();
		pac2=sc.nextLine();
		price2=sc.nextInt();
		f2=sc.nextBoolean();
		sc.nextLine();
		
		reg3=sc.nextInt();
		sc.nextLine();
		agen3=sc.nextLine();
		pac3=sc.nextLine();
		price3=sc.nextInt();
		f3=sc.nextBoolean();
		sc.nextLine();
		
		reg4=sc.nextInt();
		sc.nextLine();
		agen4=sc.nextLine();
		pac4=sc.nextLine();
		price4=sc.nextInt();
		f4=sc.nextBoolean();
		sc.nextLine();

		TravelAgencies ta[]=new TravelAgencies[4];
		ta[0]= new TravelAgencies(reg1,agen1,pac1,price1,f1);
		ta[1]= new TravelAgencies(reg2,agen2,pac2,price2,f2);
		ta[2]= new TravelAgencies(reg3,agen3,pac3,price3,f3);
		ta[3]= new TravelAgencies(reg4,agen4,pac4,price4,f4);
		
		System.out.println("DATA UPDATED SUCCESSFULLY"+"\n");
		
		int highPrice=1;
		String check_str;
		int check_reg;
		System.out.println("Regno =? and Package name = ?");
		check_reg = sc.nextInt();
		sc.nextLine();
		check_str =sc.nextLine();
		
		
		highPrice=solution.findAgencyWithHighestPackagePrice(ta);
		String res[]= solution.agencyDetailsForGivenIdAndType(ta, check_reg, check_str);
		System.out.println("\n");
		System.out.println("the Highest Price = "+ highPrice);
		System.out.println("the match pair with "+check_str+"and "+check_reg+" is -> ");
		System.out.println(res[0]);
		System.out.println(res[1]);
		sc.close();
	}
}
