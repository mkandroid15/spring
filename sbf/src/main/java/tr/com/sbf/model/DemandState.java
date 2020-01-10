/**
 * @author Mehmet
 *
 * 12 Ağu 2018
 *
 * 20:49:15
 */

package tr.com.sbf.model;

public enum DemandState {
	NOT_STARTED("Başlamadı"), WORKING_PROGRESS("Çalışılıyor"), COMPLETED("Bitti"), REJECTED("Reddedildi");

	private final String displayName;

	DemandState(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

}
