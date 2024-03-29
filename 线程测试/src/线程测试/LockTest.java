package �̲߳���;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {


	int i = 10;
	private Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
	
		LockTest lt = new LockTest();
		
			
			new Thread(lt.new Thread1()).start();
			new Thread(lt.new Thread2()).start();
		
		
	}
	
	public class Thread1 implements Runnable{

		
		@Override
		public void run() {

			while(true){
				
				synchronized(this){
					try {
						
						System.out.println("��1->>>"+ 5 / (i++));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				/*lock.lock();
				
				try{
					
					System.out.println("��1->>>"+ 5 / (i++));
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					
					lock.unlock();
				}*/
				
				
			}
		}
		
	}
	
	public class Thread2 implements Runnable{

		@Override
		public void run() {

			while(true){
				
				try {
					
					System.out.println("��1->>>"+ 5 / (i--));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				/*lock.lock();
				
				try{
					
					System.out.println("��1->>>"+ 5 / (i--));
					
				}catch(Exception e){
					
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				*/
			}
		}
		
	}
	
}
