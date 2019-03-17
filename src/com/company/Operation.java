package com.company;

abstract public class Operation {
    protected double termen1;
    protected double termen2;
    protected String operationCharacter;

    public Operation(double termen1, double termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2;
    }

    public Operation(Operation termen1, Operation termen2) {
        this.termen1 = termen1.doOperation();
        this.termen2 = termen2.doOperation();
    }

    public Operation(Operation termen1, double termen2) {
        this.termen1 = termen1.doOperation();
        this.termen2 = termen2;
    }

    public Operation(double termen1, Operation termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2.doOperation();
    }

    abstract protected double doOperation();

    @Override
    public String toString() {
        return termen1 +
                operationCharacter +
                termen2 +
                " = "
                + this.doOperation();
    }

    //sum1.equals(dif2)
    //doOperation pt sum1 = doOperation pt dif2
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operation) {
            return this.doOperation() == ((Operation) obj).doOperation();
        }
        return false;
    }
}
