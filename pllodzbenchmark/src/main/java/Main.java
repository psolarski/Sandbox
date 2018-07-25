import org.openjdk.jmh.annotations.Benchmark;

public class Main {

    public static void main(String args[]) {
        try {
            benchmark();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Benchmark
    public static int benchmark() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(1);
        return 0;
    }
}
