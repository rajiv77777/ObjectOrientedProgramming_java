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
	
	//OBJECT RETURN TYPE //RawCode (this wont work)
	public static Appliance getHiggestAmt(Appliance[] a,String ApplianceCatogery){
		double amt=0;
		int c=5;
		for(int i=0;i<4;i++)
		{
			String s=a[i].getApplianceCatogery();
			if(s.equals(ApplianceCatogery)){
				double temp=a[i].getApplianceAmt();
				if(temp>amt){
					c=i;
					amt=temp;
				}
			}
		}
		if(c==5){
			return null;
		}
		return a[c];
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


//Voter OOPS

import java.util.*;
import java.lang.*;

public class MyClass{
    public static void main(String[] args){
        int voterId;
        String voterName;
        int voterAge;
        boolean isVoteCasted;
        String constituency;
        Scanner scanner = new Scanner(System.in);
        Vote[] votes = new Vote[4];
        for(int i=0; i<votes.length; i++){
            voterId = scanner.nextInt();scanner.nextLine();
            voterName = scanner.nextLine();
            voterAge = scanner.nextInt();
            isVoteCasted = scanner.nextBoolean();scanner.nextLine();
            constituency = scanner.nextLine();
            votes[i] = new Vote(voterId, voterName, voterAge, isVoteCasted, constituency);
        }
        String checkConstituency = scanner.nextLine();
        scanner.close();
        int totalVotesCasted = findTotalVotesCastedByConstituency(votes, checkConstituency);
        if(totalVotesCasted == 0)
            System.out.println("No votes casted");
        else
            System.out.println(totalVotesCasted);
        int[] voterAgeArray = searchVoterByAge(votes);
        if(voterAgeArray == null)
            System.out.println("No such voters");
        else
            for(int voter: voterAgeArray)
                System.out.println(voter);
    }
    public static int findTotalVotesCastedByConstituency(Vote[] votes, String constituency){
        int totalVotesCasted = 0;
        for(Vote vote: votes){
            if(constituency.equalsIgnoreCase(vote.getConstituency())){
                if(vote.getIsVoteCasted())
                    totalVotesCasted++;
            }
        }
        return totalVotesCasted;
    }
    public static int[] searchVoterByAge(Vote[] votes){
         ArrayList<Integer> arrayOfVoterIdList = new ArrayList<Integer>();
         for(Vote vote: votes){
             if(vote.getVoterAge() < 30){
                 arrayOfVoterIdList.add(vote.getVoterId());
             }
         }
         if(arrayOfVoterIdList.size() == 0) return null;
         Collections.sort(arrayOfVoterIdList);
         int[] array = arrayOfVoterIdList.stream().mapToInt(i -> i).toArray();
         return array;
    }
}

class Vote{
    private int voterId;
    private String voterName;
    private int voterAge;
    private boolean isVoteCasted;
    private String constituency;
    public Vote(int voterId, String voterName, int voterAge, boolean isVoteCasted, String constituency){
        this.voterId = voterId;
        this.voterName = voterName;
        this.voterAge = voterAge;
        this.isVoteCasted = isVoteCasted;
        this.constituency = constituency;
    }
    public int getVoterId(){
        return voterId;
    }
    public String getVoterName(){
        return voterName;
    }
    public int getVoterAge(){
        return voterAge;
    }
    public boolean getIsVoteCasted(){
        return isVoteCasted;
    }
    public String getConstituency(){
        return constituency;
    }
}
