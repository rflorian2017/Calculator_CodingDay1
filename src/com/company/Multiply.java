package com.company;

public class Multiply extends Operation {

    public Multiply(double termen1, double termen2) {
        super(termen1, termen2);
        this.operationCharacter = " * ";
    }

    public Multiply(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        this.operationCharacter = " * ";
    }

    public Multiply(Operation termen1, double termen2) {
        super(termen1, termen2);
        this.operationCharacter = " * ";
    }

    public Multiply(double termen1, Operation termen2) {
        super(termen1, termen2);
        this.operationCharacter = " * ";
    }

    @Override
    protected double doOperation() {
        return this.termen1 * this.termen2;
    }
}
