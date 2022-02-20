import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StackLifoTest extends TestCase {

    @Test
    public void testLifo() {
        StackLifo sf = new StackLifo();

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

        System.out.println(Arrays.toString(sf.objArray));

        sf.pop();
        sf.pop();

        sf.isArrayIsEmpty();

        System.out.println(Arrays.toString(sf.objArray));

    }
}