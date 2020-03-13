/*
 *@author Rahul Gogyani

 *
 * 1:41 PM 3/13/2020
 */

import java.util.concurrent.Semaphore;

class SharedResource{
    static int count =0;
}

class MyThread extends Thread{
    Semaphore semaphore;
    String threadName;
    public MyThread(Semaphore semaphore, String threadName){
        super(threadName);
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public  void run(){
        if(this.getName().equals("A")){
            System.out.println("Starting Thread"+threadName);
            try{
                System.out.println(threadName+" waiting for a permit");
                semaphore.acquire();
                System.out.println(threadName+"gets a permit");
                for (int i = 0; i <5 ; i++) {
                    SharedResource.count++;
                    System.out.println(threadName+" "+SharedResource.count);
                    Thread.sleep(10);
                    
                }

            }catch (InterruptedException e){
                System.out.println(e);
            }
        }else{
            System.out.println("starting "+threadName);
            try{
                System.out.println(threadName+" is waiting for a permit");
                semaphore.acquire();
                System.out.println(threadName+" gets a permtit");
                for (int i = 0; i <5 ; i++) {
                    SharedResource.count--;
                    System.out.println(threadName+" "+SharedResource.count);
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(threadName+" release the permit");
            semaphore.release();
        }
    }
}
public class SemaphoreExample  {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        MyThread a = new MyThread(semaphore,"A");
        MyThread b = new MyThread(semaphore,"B");

        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("count "+SharedResource.count);
    }
}
