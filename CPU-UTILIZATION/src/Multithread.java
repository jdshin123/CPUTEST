
public class Multithread extends Thread{
	
public void run() {
	long startTime = System.currentTimeMillis();
	int []redArray = new int[1000];
	for(int i= 0; i <redArray.length; i++) {
		redArray[i] = i;
		try{Thread.sleep(5);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	    
		System.out.println(redArray[i] + "redArray1");
	}
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("thread running redArray");
	System.out.println(totalTime + " is the time");
	
}
}
