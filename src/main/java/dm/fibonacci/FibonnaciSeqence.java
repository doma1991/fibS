package dm.fibonacci;

public class FibonnaciSeqence {

    public Long fib(Long number) {

        Long startingNumber = Long.valueOf(0);
        Long secondNumber = Long.valueOf(1);
        Long result = Long.valueOf(0);

        if (number == 1) {

            return startingNumber;
        }
        if (number == 2) {

            return secondNumber;
        }

        int x = 2;
        while (x < number) {
            result = startingNumber + secondNumber;
            startingNumber = secondNumber;
            secondNumber = result;
            x++;
        }

        return result;
    }

}
