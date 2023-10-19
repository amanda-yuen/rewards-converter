/** Create a RewardValue class
 * This class must satisfy the following requirements:
 *  RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
 *  RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
 *  RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
 *  RewardValue must convert from miles to cash at a rate of 0.0035.*/

public class RewardValue {

    double cashValue;
    int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    protected double getCashValue() {
        return this.cashValue;
    }

    protected double getMilesValue() {
        return this.cashValue * 0.0035;
    }
}
