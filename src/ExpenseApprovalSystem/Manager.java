package ExpenseApprovalSystem;

public class Manager extends Approver {

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Manager approved the expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}
