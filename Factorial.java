public class Factorial{
    /*public static long computeFac(long i){
	    if(i==1L){
	       return 1;
	   
	   }
	   return i*computeFac(i-1);
	}
	

    public static void main(String[] args){
	   long result=computeFac(20);
	   System.out.println(result);
	} */
	
	public static void main(String [] args){
		
		/*int[] a=new int[8];
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		String[] b=new String[8];
        boolean[] c=new boolean[8];		
		for(i=0;i<8;i++){
			
			System.out.println(b[i]);
			System.out.println(c[i]);
		}*/
		
		/*int[] x=null;
		x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
			
		}
		int[] y=x;
		for(i=0;i<y.length;i++){
			
			
			System.out.println(y[i]);
		
		}
		
		//静态初始化
		  int[] p={10,20,29};//简写
		  int[] z=new int[]{1,2,3};//完整格式
		  
		//匿名数组
		System.out.println(new int[]{1,2,3}.length);*/
		
		//将两个数组拼接起来
		/*int[] a=new int[]{1,2,3,4};
		int[] b=new int[]{5,6,7};
		 //动态初始化
		 int[] c=new int[a.length+b.length];
		 
		 for(int i=0;i<a.length;i++){
			 c[i]=a[i];
		 }
		 for(i=a.length;i<c.length;i++){
		     c[i]=b[i-a.length];
				 
		 }*/
		 
			 
		//二维数组
         int[][] a=new int[2][3];//行不能省略。列可以省略
		  a[0][0]=1;
		  a[1][2]=4;
		  //a.length  行
          for(int i=0;i<a.length;i++){
			  //a[i].length 该行的列数
			  for(int j=0;j<a[i].length;j++){
			  
				  System.out.print(a[i][j]+"\t");
			  }
			  System.out.println();
			  
		  }	
		
		
	}
}