package BenchmarkRunner;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class BenchmarkNotNull {

    @Param({ "100", "200", "300", "500", "1000" })
    public int iterations;

    private Object object;

    @Setup(Level.Invocation)
    public void setUp() {
        object = null;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 3)
    @Measurement(iterations = 5)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void benchmarkNotNull(Blackhole blackhole) {

        for (int i = iterations; i > 0; i--) {
            blackhole.consume(object != null);
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 3)
    @Measurement(iterations = 5)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void benchmarkStaticNotNull(Blackhole blackhole) {

        for (int i = iterations; i > 0; i--) {
            blackhole.consume(!Objects.isNull(object));
        }
    }
}
