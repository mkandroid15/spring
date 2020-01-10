/**
 * 
 */
package tr.com.sbf.model;

/**
 * @author Mehmet.Kaynak
 *
 *         13 Ara 2017
 *
 *         22:35:32
 */
public enum DangerState {
    SMALL("Az Tehlikeli"), MIDDLE("Tehlikeli"), HIGH("Çok Tehlikeli");

    private final String displayName;

    DangerState(final String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}
