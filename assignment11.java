public class assignment11 
{

	public static void main(String[] args)
	{
		int[][] trust = new int[2][2];
	 //creates pairs (1,3) and (2,3)
		trust[0][0]= 1;
		trust[0][1]= 3;
		trust[1][0]= 2;
		trust[1][1]= 3;
		
	
		Judge pracJ = new Judge();
		int judge = pracJ.findJudge(4, trust);
		System.out.println(judge);
	}
}