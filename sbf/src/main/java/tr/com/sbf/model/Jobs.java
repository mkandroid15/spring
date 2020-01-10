package tr.com.sbf.model;

import tr.com.sbf.common.SbfConstants;

public enum Jobs {
	MALI_MUSAVIR(SbfConstants.MALI_MUSAVIR), GUMRUK_MUSAVIRI(SbfConstants.GUMRUK_MUSAVIRI), DERNEK(
			SbfConstants.DERNEK), ARAC_SATIS_BAYII(SbfConstants.ARAC_SATIS_BAYII), EMLAK_OFISI(
					SbfConstants.EMLAK_OFISI), SIGORTA_ACENTESI(
							SbfConstants.SIGORTA_ACENTESI), DANISMAN(SbfConstants.DANISMAN), DIGER(SbfConstants.DIGER);

	private final String displayName;

	Jobs(final String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public static Jobs fromDisplayName(String displayName) {
		switch (displayName) {
		case SbfConstants.MALI_MUSAVIR:
			return Jobs.MALI_MUSAVIR;
		case SbfConstants.GUMRUK_MUSAVIRI:
			return Jobs.GUMRUK_MUSAVIRI;
		case SbfConstants.DERNEK:
			return Jobs.DERNEK;
		case SbfConstants.ARAC_SATIS_BAYII:
			return Jobs.ARAC_SATIS_BAYII;
		case SbfConstants.EMLAK_OFISI:
			return Jobs.EMLAK_OFISI;
		case SbfConstants.SIGORTA_ACENTESI:
			return Jobs.SIGORTA_ACENTESI;
		case SbfConstants.DANISMAN:
			return Jobs.DANISMAN;
		case SbfConstants.DIGER:
			return Jobs.DIGER;
		default:
			throw new IllegalArgumentException(displayName + " bulunamadı.");
		}
	}
}
