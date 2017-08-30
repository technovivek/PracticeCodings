public class OddBeforeEveninArray{

     public static void main(String []args){
         int i=0,j=0,temp=0;
        int[] arr={7,8,5,2,9,11,3,8};
        System.out.print("Original Array\n");
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.print("\n");
        for(i=0;i<arr.length;i++)
        {
            j=i;
            while(arr[j]%2==0&&j<arr.length-1)
            j++;
            
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.print("New Array ");
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
     }
}
