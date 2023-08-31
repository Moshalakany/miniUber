public class TechnicalSupport implements SupportHandler
{
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler)
    {
        this.nextHandler=handler;
    }

    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == 2) {
            System.out.println("technical support is handling the issue: " + ticket.getIssue());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
