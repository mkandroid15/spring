/**
 * 
 */
package tr.com.sbf.model;

/**
 * @author Mehmet.Kaynak
 *
 *         22 Ara 2017
 *
 *         16:20:17
 */
public enum ProcessType {

    YENI("Yeni"), YENILEME("Yenileme"), SIFIR("Sifir");

    private final String displayName;

    private ProcessType(final String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}
