import dm.fibonacci.FibonnaciSeqence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FibonnaciSequenceTest {

    @Test
    public void checkThatTheMethodReturnsANumber() {
        FibonnaciSeqence seqence = new FibonnaciSeqence();
        Long fibSequence = seqence.fib((long) 1);
        assertEquals(Long.valueOf(0), fibSequence);
    }

    @Test
    public void firstNumberInTheSequenceIsAlwaysZero() {
        FibonnaciSeqence seqence = new FibonnaciSeqence();
        Long fibSequence = seqence.fib((long) 1);
        assertEquals(Long.valueOf(0), fibSequence);
    }

    @Test
    public void secondNumnberInTheSequenceIsAlwaysOne() {
        FibonnaciSeqence seqence = new FibonnaciSeqence();
        Long fibSequence = seqence.fib((long) 2);
        assertEquals(Long.valueOf(1), fibSequence);
    }

    @Test
    public void thirdNumberInTheSequenceIsATotalOfTwoPreviousNumbers() {
        FibonnaciSeqence seqence = new FibonnaciSeqence();
        Long fibSequence = seqence.fib((long) 3);
        assertEquals(Long.valueOf(1), fibSequence);
    }

    @Test
    public void fibonnaciSequenceReturnsSumOfTwoPreviousNumbersFromTheSequence() {
        FibonnaciSeqence seqence = new FibonnaciSeqence();
        Long fibSequenceOne = seqence.fib((long) 5);
        Long fibSequenceTwo = seqence.fib((long) 6);
        Long fibSequenceThree = seqence.fib((long) 7);
        Long desiredFibSequence = fibSequenceOne + fibSequenceTwo;
        assertEquals(desiredFibSequence, fibSequenceThree);
    }



}
