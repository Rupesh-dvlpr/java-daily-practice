package Exception;

public class UncheckedExceptionArrayStoreException {
	  public static void main(String[] args) {
	       Integer arr[]= new Integer[5];
	       Object obj[] = arr;
	       try{
	            obj[0] = "rupesh";
	            IO.println("Stored successfully: "+obj[0]);
	       }
	       catch(ArrayStoreException e){
	            IO.println("ArrayStoreException: "+e);
	       }
	    }
}
