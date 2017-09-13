String[] arr3={"Mumbai","Delhi","Kolkata","Bokaro","Bangalore"};
		String[] arr4={"Mumbai","Lucknow","Jammu","Bokaro","Kerala"};
		
		 int m,n;
		
		 for(m=0;m<arr1.length;m++)
			{
				for(n=0;n<arr4.length;n++)
				{
					if(arr3[m].equals(arr4[n]))
					{
						System.out.println(arr3[m]+" is common");
					}
				}
			}
