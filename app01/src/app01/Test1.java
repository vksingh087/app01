package app01;
class XMT
{
	int x,y;
}

public class Test1  
{	
	static void ourMethod(int arr[])
	{
		int j=0,temp;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String arg[])
	{
		int arr[]= {-5,12,3,-4,-8,6,-71,-8,9};
		ourMethod(arr);
	
	}
	

}
