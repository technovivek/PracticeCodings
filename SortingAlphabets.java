String[] orr={"Ram","Vivek","Priya","Ram","Vivek","Delhi"};
		
		int i=0,j;
		char c='\0';
		String temp=null;
		for(i=0;i<orr.length;i++)
		{
			for(j=i+1;j<orr.length;j++)
			{
				if((int)orr[i].charAt(0)>=(int)orr[j].charAt(0))
				{
					
				temp=orr[i];
				orr[i]=orr[j];
				orr[j]=temp;
				
				}
			}
			System.out.print(orr[i]+" ");
		}
