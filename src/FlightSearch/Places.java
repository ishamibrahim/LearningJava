package FlightSearch;

public enum Places {
    BAN("BAN"),
    NDL("NDL"),
    MUM("MUM");

    private String code;
    Places(String val) {
         this.code = val;
    }

    public String getCode(){
        return code;
    }
}
