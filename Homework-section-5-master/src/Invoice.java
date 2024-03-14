public class Invoice {
    private int invoiceNumber;
    private String InvoiceTpe;
    //-------------------------------------------------//
    public Invoice() {

    }

    public Invoice(int invoiceNumber, String InvoiceTpe) {
        this.invoiceNumber = invoiceNumber;
        this.InvoiceTpe = InvoiceTpe;

    }


    //-------------------------------------------------//
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    //-------------------------------------------------//
    public String getInvoiceTpe() {
        return InvoiceTpe;
    }

    public void setInvoiceTpe(String invoiceTpe) {
        this.InvoiceTpe = invoiceTpe;
    }
    //-------------------------------------------------//
}
