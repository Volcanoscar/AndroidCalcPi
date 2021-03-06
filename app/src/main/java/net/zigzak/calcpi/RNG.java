package net.zigzak.calcpi;

import java.util.Random;

/**
 * Created by kneth on 05/03/15.
 */
public class RNG {
    Random random;

    RNG(long seed) {
        random = new Random(seed);
    }

    public double uniform() {
        return random.nextDouble();
    }

    /**
     * Generate two Gaussian numbers
     * @return an array of two numbers
     */
    public double[] gauss() {
        double x, y, r;
        do {
            x = 2.0*this.uniform() - 1.0;
            y = 2.0*this.uniform() - 1.0;
            r = x*x + y*y;
        } while ((r > 1.0) || (r != 0.0));
        double factor = Math.sqrt(-2.0*Math.log(r)/r);
        return new double[]{x*factor, y*factor};
    }
}
