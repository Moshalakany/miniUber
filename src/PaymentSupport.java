public class PaymentSupport implements SupportHandler
{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler)
    {
        this.nextHandler=null;
    }

    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 3) {
            System.out.println("payment support is handling the issue: " + ticket.getIssue());
        } else  {
            System.out.println("Your problem is not our business ");
        }

    }
}
