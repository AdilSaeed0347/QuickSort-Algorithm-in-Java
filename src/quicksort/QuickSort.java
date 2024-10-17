
package quicksort;
import java .util.Scanner;
public class QuickSort {
    public static int partition(int []array, int low,int  high)
    {int pivot=array[high];
    int i=low-1;
    for(int j=low; j<high; j++)
    {
        if (array[j]<pivot){
            i++;
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        
        }
        }
    i++;
    int temp=array[i];
    array[i]=pivot;
    array[high]=temp;
    return i;
    }
        
    
    public static void QuickSort(int [] array, int low, int high){
    if(low<high)
    {int pivotIndex= partition(array,low,high);
     QuickSort(array,low,pivotIndex-1);
     QuickSort(array,pivotIndex+1,high);
    
    }
    }
    
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int size;
        System.out.println("Enter size of an array :");
        size=kb.nextInt();
        int [] array=new int[size];
        
        for(int i=0; i<size; i++)
        {   System.out.println("Enter Element "+(i+1));
            array[i]=kb.nextInt();
        }
      
      int n=array.length;
      QuickSort(array,0,n-1);
      for(int i=0; i<n; i++)
      {
          System.out.print(array[i]+" ");
      }
        System.out.println();
    }
    
}
