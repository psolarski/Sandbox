package BenchmarkRunner;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class StringConcatenation {

    @Param({ "100", "200", "300", "500", "1000" })
    private int iterations;

    private String ala = "ala", ma = "ma", kota = "kota";
    private String sentence;
    private StringBuilder stringBuilder;

    @Setup(Level.Invocation)
    public void setUp() {
        stringBuilder = new StringBuilder();
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 3)
    @Measurement(iterations = 5)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void benchmarkStringConcatenation(Blackhole blackhole) {

        for (int i = iterations; i > 0; i--) {
            sentence = ala + " " + ma + " " + kota;
            blackhole.consume(sentence);
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 3)
    @Measurement(iterations = 5)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void benchmarkStringBuilder(Blackhole blackhole) {

        for (int i = iterations; i > 0; i--) {
            stringBuilder.append(ala).append(" ").append(ma).append(" ").append(kota);
            blackhole.consume(stringBuilder.toString());
        }
    }
}

