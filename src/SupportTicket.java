public class SupportTicket {
    private String issue;
    private int priority;
    public SupportTicket(String issue, int priority) {
        this.issue = issue;
        this.priority = priority;
    }
    public String getIssue() {
        return issue;
    }
    public int getPriority() {
        return priority;
    }
}
