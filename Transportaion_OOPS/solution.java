package TcsILP;

public class solution {

	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] c) 
	{
		int highestPrice=0;
		 int temp; 
		 for(TravelAgencies i : c ) 
		 { 
			if(i.getPrice() > highestPrice) 
			 {
				 temp=i.getPrice(); 
				 highestPrice = temp;
			 } 
		}		 
		 return highestPrice;
	}
	
	public static String[] agencyDetailsForGivenIdAndType(TravelAgencies[] c1 ,int a,String s) 
	{
		String str1,str2;
		int i;
		String ans[] = new String[2];
		String ans2[] = {"no","no"};
		for(TravelAgencies itr1:c1) {
			if(itr1.isFlightFacility())
			{
				if((itr1.getRegNo() == a) && (itr1.getPackageType().equalsIgnoreCase(s)))
				{
					str1=itr1.getAgencyName();
					ans[0]=str1;
					i=itr1.getPrice();
					str2=String.valueOf(i);
					ans[1]=str2;
					return ans;
				}
			}
			else
			{
				System.out.println("No flight Facility ");
				return null;
			}
		}
		return ans2;
	}
}