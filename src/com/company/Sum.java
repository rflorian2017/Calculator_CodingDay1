package com.company;

public class Sum extends Operation{

    public Sum(double termen1, double termen2) {
        super(termen1, termen2);
        this.operationCharacter = " + ";
        //all of the above are valid
        //super.operationCharacter = " + ";
        //operationCharacter = " + ";
    }

    public Sum(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        this.operationCharacter = " + ";
    }

    public Sum(Operation termen1, double termen2) {
        super(termen1, termen2);
        this.operationCharacter = " + ";
    }

    public Sum(double termen1, Operation termen2) {
        super(termen1, termen2);
        this.operationCharacter = " + ";

    }

    @Override
    protected double doOperation() {
        return this.termen1 + this.termen2;
    }
}
