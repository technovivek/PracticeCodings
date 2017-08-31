public class Factors{

     public static void main(String []args){
        int num,i=1,count=0;
        
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(i<=num)
        {
            if(num%i==0)
            count++;
            i++;
        }
        System.out.println("Factors of"+num+"are"+count);
     }
     
}
