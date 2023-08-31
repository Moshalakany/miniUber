public interface SupportHandler {

    public void setNextHandler(SupportHandler handler) ;

    public abstract void handleRequest(SupportTicket ticket);
}
