public class CustomerService implements SupportHandler
{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler)
    {
        this.nextHandler=handler;
    }

    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 1) {
            System.out.println("customer support is handling the issue: " + ticket.getIssue());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
