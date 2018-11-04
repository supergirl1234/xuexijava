 public class ArrayUtils{
    //1.计算数组中最大值
	public static int arrayMaxElement(int[] data){
		if(data==null){
			//IllegalArgumentException  参数异常
			throw new IllegalArgumentException("a must not be null");
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<data.length;i++){
			 if(data[i]>max){
				 
				 max=data[i];
			 }
			
		}
		return max;

	}
	//2.计算数组中最小值
	public static int arrayMinElement(int[] data){
		if(data==null){
			throw new IllegalArgumentException("a must not be null");
			
		}
		 int min=Integer.MAX_VALUE;
		 for(int i=0;i<data.length;i++){
			 
			 if(data[i]<min){
				 min=data[i];
			 }
		 }
		 return min;
	}
	//3.计算数组之和
	public static int arrayElementsum(int[] data){
		if(data==null){
			throw new IllegalArgumentException("a must not be null");
			
		}
		 int sum=0;
		 for(int i=0;i<data.length;i++){
			 
			 sum=sum+data[i];
		 }
		 return sum;
	}
	//4.数组拼接
	public static int[] arrayJoin(int[] a,int[] b){
		if(a==null){
			throw new IllegalArgumentException("a must not be null");
			
		}
		if(b==null){
			
			throw new IllegalArgumentException("b must not be null");
		}
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
			
		}
		for(int i=a.length;i<c.length;i++){
			c[i]=b[i-a.length];
			
		}
		return c;

	}
	//5.数组截取
	public static int[] arraySub(int[] a,int start,int end){
		if(a==null){
			throw new IllegalArgumentException("a must not be null");
			
		}
		if(start<0||end<0){
			
			throw new IllegalArgumentException("start and end must  be >0");
		}
		if(start>end){
			
			throw new IllegalArgumentException("start>end");
		}
		if(start>a.length){
			
			throw new IllegalArgumentException("start must  be <a.length");
		}
		
		int count=end-start;
		if(count>a.length){
			
			throw new IllegalArgumentException("count must  be <=a.length");
		}
		int[] c=new int[count];
		  for(int i=start;i<end;i++){
			  c[i-start]=a[i];
		  }
		
		 return c;
	}
	//打印数组
	public static void printArray(int[] a){
		   for(int i=0;i<a.length;i++){
			   System.out.print(a[i]+" ");
		   }
		   System.out.println();
	   }

	public static void main(String[] args){
		int[] a=new int[]{1,2,3,4,5,6};
		int[] b=new int[]{7,8,9,10,11};
		int max=arrayMaxElement(a);
		int min=arrayMinElement(a);
		int sum=arrayElementsum(a);
		int[] c=arrayJoin(a,b);
		int[] d=arraySub(a,2,3);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		printArray(c);
		printArray(d);

	}
}

