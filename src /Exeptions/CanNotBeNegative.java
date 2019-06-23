package Exeptions;

public class CanNotBeNegative extends Exception {

    public CanNotBeNegative(String errMessage, Throwable err) {
        super(errMessage, err);
    }
}