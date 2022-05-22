

public class Priority implements Runnable{
    int count; Thread thread; static boolean stop =false; static String currentName;

    Priority(String name){
        thread = new Thread(this, name);
        count=0;
        currentName = name;
    }


    public void run() {
        System.out.println(thread.getName() + "start to operate");
        do {
            count++;
            if (currentName.compareTo(thread.getName())!= 0){
                currentName = thread.getName();
                System.out.println(currentName + " is executed");
            }

        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() +" finishes running");


    }
}

class PriorityDemo{
    public static void main(String[] args) {


    Priority nt1 = new Priority("High priority thread");
    Priority nt2 = new Priority(" thread with low priority");
    Priority nt3 = new Priority(" Thread #1 with normal priority");
    Priority nt4 = new Priority("Thread #2 with normal priority");
    Priority nt5 = new Priority("Thread #3 with normal priority");
    nt1.thread.setPriority(Thread.MAX_PRIORITY);
    nt2.thread.setPriority(Thread.MIN_PRIORITY);
    nt1.thread.start(); nt2.thread.start(); nt3.thread.start(); nt4.thread.start(); nt5.thread.start();
    try {
        nt1.thread.join(); nt2.thread.join(); nt3.thread.join(); nt4.thread.join(); nt5.thread.join();
    }
    catch (InterruptedException e){
        System.out.println("The main thread starts running");
    }
        System.out.println("\nHigh priority thread counted to "+ nt1.count);
        System.out.println("The low priority thread added to "+ nt2.count);
        System.out.println("#1 normal priority thread added to "+ nt3.count);
        System.out.println("#2 normal priority thread added to"+ nt4.count);
        System.out.println("#3 normal priority thread added to "+ nt5.count);

   }


}
