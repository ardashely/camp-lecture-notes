package kodlamaio.northwind.core.utilites.results;

public class SuccesResult extends Result {

    public SuccesResult() {
        super(true);
    }

    public SuccesResult(String message) {
        super(true, message);
    }
}
