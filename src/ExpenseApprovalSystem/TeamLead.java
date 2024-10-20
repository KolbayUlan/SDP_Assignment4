package ExpenseApprovalSystem;

public class TeamLead extends Approver {

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("TeamLead approved the expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

