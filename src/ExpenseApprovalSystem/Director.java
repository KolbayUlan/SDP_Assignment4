package ExpenseApprovalSystem;

public class Director extends Approver {

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approved the expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}
