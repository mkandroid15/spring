/**
 * 
 */
package tr.com.sbf.model;

/**
 * @author Mehmet.Kaynak
 *
 *         13 Ara 2017
 *
 *         18:40:39
 */
public enum ConsultingType {
    YMM("YMM"), HUKUK("Hukuk"), GUMRUK("Gümrük"), SGK("SGK"), ISO("ISO"), OSGB("OSGB");

    private final String displayName;

    ConsultingType(final String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}
