/**
 * 
 */
package tr.com.sbf.model;

/**
 * @author Mehmet.Kaynak
 *
 *         21 Ara 2017
 *
 *         23:19:40
 */
public enum PolicyType {
    TRAFIK("Trafik"), KASKO("Kasko");

    private final String displayName;

    private PolicyType(final String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}
