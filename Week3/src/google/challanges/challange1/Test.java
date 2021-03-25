package google.challanges.challange1;

public class Test {

//		public static void swap(int[] arr,int i, int j) {
//			int iValue=arr[i];
//			int jValue = arr[j];
//			arr[i]=jValue;
//			arr[j]=iValue;
//		}
//	
//	    public static int partition(int[] arr,int l, int h){
//	        int pivot = arr[l];
//	        int i=l; int j=h;
//	        while(i<j){
//	            while(arr[i]<=pivot){
//	                i++;
//	            }
//	            while(arr[j]>pivot){
//	                j--;
//	            }
//	            if(i<j){
//	            swap(arr,i,j);
//	            }
//	            swap(arr,i,j);
//	        }
//            return j;
//
//	        }
//	        
//	    public static void quickSort(int[] arr,int l,int h){
//	        int j;
//	    	if(l<h){
//	            j=partition(arr,l,h);
//	            quickSort(arr,l,j);
//	            quickSort(arr,j+1,h);
//	            
//	        }
//	    }
//	
//	public static void main(String[] args) {
//		
//		int[] x= {13,4,2,66,4,5,9,9,2};
//		quickSort(x, x[0], x.length);
//		for()
//		System.out.println(x);
//	}
//	private static int partition(int arr[], int begin, int end) {
//	    int pivot = arr[end];
//	    int i = (begin-1);
//
//	    for (int j = begin; j < end; j++) {
//	        if (arr[j] <= pivot) {
//	            i++;
//
//	            int swapTemp = arr[i];
//	            arr[i] = arr[j];
//	            arr[j] = swapTemp;
//	        }
//	    }
//
//	    int swapTemp = arr[i+1];
//	    arr[i+1] = arr[end];
//	    arr[end] = swapTemp;
//
//	    return i+1;
//	    }
//        
//	public static void quickSort(int arr[], int begin, int end) {
//	    if (begin < end) {
//	        int partitionIndex = partition(arr, begin, end);
//
//	        quickSort(arr, begin, partitionIndex-1);
//	        quickSort(arr, partitionIndex+1, end);
//	    }
//	}
//public static void main(String[] args) {
//	
//	int[] x= {13,4,2,66,4,5,9,9,2};
//	int[] y= {13,4,66,9,2,2};
//
//	int a= solution(x,y);
//	System.out.println(a);
////	quickSort(x, 0, x.length-1);
////	for(int i=0;i<x.length;i++) {
////		
////		System.out.println(x[i]);
////	}
//}
//
//public static int[] initVector( int[] x, int[] y) {
//	int length= x.length+y.length;	
//	int i=0;
//	int[] v= new int[length];
//	while(i<x.length){
//		v[i]=x[i];
//		i++;
//	}
//	int j=0;
//	while(j<y.length){
//		v[i]=y[j];
//		j++;
//	}
//	return v;
//}
//	public static int solution(int[] x, int[] y) {
//		int[] v =initVector(x, y);
//		quickSort(v, 0, v.length-1);
//		return getUniqueNumber(v);
//		
//		
//	}
//
//	private static int getUniqueNumber(int[] v) {
//		int i=1;
//		while(i<v.length-1) {
//			if(v[i]!=v[i-1]&&v[i]!=v[i+1]) {
//			return v[i];
//			}
//			i++;
//		}
//		
//		return 0;
//	}
//			
//}
//    
//
	private static int strCompare(String s1, String s2) {
		String[] strArray1=s1.split("\\.");
		String[] strArray2=s2.split("\\."); 
		int minLenght = 0;
		 minLenght=(int) ((strArray1.length<strArray2.length)
			? strArray1.length
			: strArray2.length);
		
		 int result=0;
		 for(int i=0;i<minLenght;i++) {
			 result= Integer.parseInt(strArray1[i])-Integer.parseInt(strArray2[i]);
			 if( result!=0) {
				 return  result;
			 }
		 }
		 if(result==0) {
			 result = strArray1.length-strArray2.length;
		 }
		 
		return result;
	}
	
	public static String[] solution(String[] l) {
		
	for (int i=0;i<l.length;i++) {
		for(int j=0;j<l.length;j++) {
			if(strCompare(l[i],l[j])<0) {
				String aux= l[i];
				l[i]=l[j];
				l[j]=aux;
			}
		}
	}
		return l;
	    }

public static void main(String[] args) {
	
//	String a="3.2.3";
//	String[] arr = a.split("\\.");
//	System.out.println(arr.length);
//	System.out.println(arr[0]);
	String[] arr={"1.1","1.0","3.2.12","2.2","3.2.4"};
	String[] sol= solution(arr);
	
	
}
}