public class Data{
    public static void arrayExpend(int[] a){
	   for(int i=0;i<a.length;i++){
	     a[i]=a[i]*5;
	   }
	}
	public static int[] arrayExpend2(int[] a){//通过该方法，a数组的内容不会变
	    if(a==null){
		   return new int[]{};
		}
	    int[] temp=new int[a.length];//空间的重新分配
		for(int i=0;i<temp.length;i++){
		     temp[i]=a[i]*5;
		}
	   return temp;
	}
    public static void print(int [] a){
	  if(a==null){
	      return;
	  }
	   for(int i=0;i<a.length;i++){
	       System.out.println(a[i]+" ");
	   }
	}
    public static void main(){
	   int[] a=new int[]{1,2,3,4};
	   print(a);
	   arrayExpend(a);
	   print(a);
	   int[] newarray=arrayExpend2(a);
	   print(newarray);
	}
}