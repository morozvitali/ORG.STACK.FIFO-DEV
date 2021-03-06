import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackFifoTest extends TestCase {

    @Test
    void testFifo() {
        StackFifo sf = new StackFifo();

        System.out.println(Arrays.toString(sf.objArray));

        sf.isArrayIsEmpty();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();
        sf.push();

        sf.isArrayIsEmpty();

        System.out.println(Arrays.toString(sf.objArray));

        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();
        sf.pop();

        sf.isArrayIsEmpty();

        System.out.println(Arrays.toString(sf.objArray));

    }
}