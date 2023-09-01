public class PaymentSupport implements SupportHandler
{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler)
    {
        this.nextHandler=handler;
    }

    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 3) {
            System.out.println("payment support is handling the issue: " + ticket.getIssue());
        } else  {
            System.out.println("this problem can not be handled");
        }

    }
}
