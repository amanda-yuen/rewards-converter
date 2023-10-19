/** Create a RewardValue class
 * This class must satisfy the following requirements:
 *  RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
 *  RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
 *  RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
 *  RewardValue must convert from miles to cash at a rate of 0.0035.*/

public class RewardValue {

    private final double cashValue;
    private final double CONVERT_MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int mileValue) {
        this.cashValue = mileValue * CONVERT_MILES_TO_CASH;
    }

    protected double getCashValue() {
        return cashValue;
    }

    protected int getMilesValue() {
        return (int) (cashValue/CONVERT_MILES_TO_CASH);
    }
}
