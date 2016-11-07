package school.lemon.changerequest.java.banking.impl;

public class BankOperation {

    private OperationType type;
    private double value;

    public BankOperation(OperationType type) {
        this(type, 0.0);
    }

    public BankOperation(OperationType type, double value) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.value = value;
    }

    public OperationType getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}
