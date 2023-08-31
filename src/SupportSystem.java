public class SupportSystem
{
    private CustomerService cs;
    private TechnicalSupport ts;
    private PaymentSupport ps;

    public SupportSystem()
    {
        cs = new CustomerService();
        ts = new TechnicalSupport();
        ps = new PaymentSupport();
        cs.setNextHandler(ts);
        ts.setNextHandler(ps);
    }
    public void processSupportTicket(SupportTicket ticket) {
        cs.handleRequest(ticket);
    }
}
