package unique;

public class unique {
	
	public int unique(int input0) {
		int count=0;
		int uni=0;
		String s = ""+input0;
		int n = s.length();
		int arr[] = new int[n+1];
		for(int i=1;i<n;i++)
		{
	    int num=input0%10;
	    System.out.println(num);
		 arr[i] = num;
		input0=input0/10;
		}
		
		if(input0>0)
		{
			for(int i=0;i<n-1;i++)
			{
					if(arr[i+1]==arr[i])
					{
						count=count+1;
					}
				}
			}
		uni=n-count;
		return uni;
	}
	}





