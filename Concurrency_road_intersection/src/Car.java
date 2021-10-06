import java.util.Random;

public class Car extends Thread{
    private int id;

    public Car() {
        Random r = new Random();
        id = r.nextInt(10000);
    }

    @Override
    public void run() {
        try {
            System.out.println("Car " + id + " is approaching the intersection");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Car " + id + " is arrived at the intersection");
        synchronized (Traffic.intersectionBusy){
            while(Traffic.intersectionBusy && Traffic.redLight){
                try {
                    Traffic.intersectionBusy.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Traffic.intersectionBusy = false;
            Traffic.intersectionBusy.notifyAll();
            System.out.println("Car " + id + " exited the intersection");
        }
        try {
            Thread.sleep(3000);
            System.out.println("Car " + id + " disappeared!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
