import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

public class Main {

    public static void main(String args[]) {
        try {
            benchmark();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 1, time = 2) // jedna iteracja rozgrzewkowa trwająca 2 sekundy
    @Measurement(iterations = 2, time = 2)
    public static int benchmark() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(1);
        return 0;
    }
}
