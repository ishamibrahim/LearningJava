package Measurements;

public enum Units {
    LITRE ("LITRE"),
    CC ( "CC"),
    TSPOON("TSPOON"),
    ML("ML"),
    GALLON("GALLON"),
    PINT("PINT"),
    INVALID("INVALID");

    private String value;
    Units(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
