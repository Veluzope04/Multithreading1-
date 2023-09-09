public class NumberThread extends Thread {
    private int start;
    private int stop;
    private int delay;


    public NumberThread(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i=0; i<=100; i++){
            System.out.println(i);

            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
