package ExpenseApprovalSystem;

public class CEO extends Approver {

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() > 5000) {
            System.out.println("CEO approved the expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}
