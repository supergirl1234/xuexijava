import java.util.Arrays;//sort所在的包
public class Arraysort{
   public static void printArray(int[] a){
	   for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
	   }
	   System.out.println();
   }
   //排序,sort方法，无返回值
  /*public static void main(String[] args){
	     int [] a=new int[]{11,4,23,56,37};
		 System.out.println("排序之前");
		 printArray(a);
		 System.out.println();
		 Arrays.sort(a);
		 System.out.println("排序之后");
		 printArray(a);
	}*/
	//拷贝
	public static void main(String[] args){
		int[] src=new int[]{1,2,3,4,5,6,7};
		int[] desc=new int[3];
		printArray(src);
		printArray(desc);
		//arraycopy
		System.arraycopy(src,2,desc,0,3);
		printArray(desc);
		//copyOf
		int[] de=Arrays.copyOf(src,3);
		printArray(src);
		printArray(de);
	}
	
	
	//求一个数组的最大值，最小值，平均值，总和
	  
	
	
	
}