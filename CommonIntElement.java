int[] arr1={2,4,1,3,12,33,6,5};
		int[] arr2={8,3,1,2,12,66,77,99};
		
		int i=0,j=0,dup=0;
		
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" is common");
				}
			}
		}
