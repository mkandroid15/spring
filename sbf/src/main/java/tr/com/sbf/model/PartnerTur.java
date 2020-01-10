package tr.com.sbf.model;

public enum PartnerTur {
    OZEL("Özel"), TUZEL("Tüzel");

    private final String displayName;

    PartnerTur(final String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}