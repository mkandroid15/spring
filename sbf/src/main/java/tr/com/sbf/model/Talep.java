/**
 * 
 */
package tr.com.sbf.model;

/**
 * @author Mehmet.Kaynak
 *
 *         12 Ara 2017
 *
 *         09:04:46
 */
public class Talep {

    PartnerSummary partner;
    Customer customer;
    Consulting consulting;

    public PartnerSummary getPartner() {
        return this.partner;
    }

    public void setPartner(final PartnerSummary partner) {
        this.partner = partner;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public Consulting getConsulting() {
        return this.consulting;
    }

    public void setConsulting(final Consulting consulting) {
        this.consulting = consulting;
    }

}
