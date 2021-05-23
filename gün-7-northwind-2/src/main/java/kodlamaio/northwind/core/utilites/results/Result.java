package kodlamaio.northwind.core.utilites.results;

public class Result {
    private boolean succes;
    private String message;

    public Result(boolean succes) {
        this.succes = succes;
    }

    public Result(boolean succes, String message) {
        this(succes);
        this.message = message;
    }

    public boolean isSucces() {
        return this.succes;
    }

    public String getMessage() {
        return this.message;
    }
}