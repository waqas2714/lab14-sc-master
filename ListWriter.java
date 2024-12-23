import java.util.concurrent.CopyOnWriteArrayList;

class ListWriter extends Thread {
    private CopyOnWriteArrayList<Integer> list;

    public ListWriter(CopyOnWriteArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // Add 100 elements to the list (write operation)
        for (int i = 0; i < 100; i++) {
            list.add(i);
            try {
                // Simulate some delay to allow other threads to access the list
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}