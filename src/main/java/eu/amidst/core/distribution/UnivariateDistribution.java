package eu.amidst.core.distribution;

/**
 * <h2>This interface generalizes the set of univariate distributions.</h2>
 *
 * @author Antonio Fernández
 * @version 1.0
 * @since 2014-11-3
 */
public interface UnivariateDistribution extends Distribution {

    /**
     * Evaluates the distribution in a given point.
     * @param value The point to be evaluated.
     * @return A <code>double</code> value with the evaluated distribution.
     */
    double getProbability(double value);

    /**
     * Evaluates the distribution in a given point.
     * @param value The point to be evaluated.
     * @return A <code>double</code> value with the logarithm of the evaluated distribution.
     */
    double getLogProbability(double value);
}
