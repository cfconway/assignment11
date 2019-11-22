public class Judge
{ 
	public int findJudge(int n, int[][] trust)
	{
	
		int[]personA = new int[n+1];
		int[] personB = new int[n+1];
		for(int i=0; i<trust.length; i++)
		{
			personA[trust[i][0]]++;
		}
		for(int i=0; i<trust.length; i++)
		{
			personB[trust[i][1]]++;
		}
		for(int i=1; i<personA.length; i++)
		{
			if(personB[i]>0 && personA[i]==0 && personB[i]==n-1)
			{
				return i;
			}
		}
		return -1; 
	}




}