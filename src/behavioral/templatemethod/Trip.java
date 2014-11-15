package behavioral.templatemethod;


public abstract class Trip {
    public final void performTrip() {
        coming();
        dayOnePlan();
        dayTwoPlan();
        dayThirdPlan();
        returning();
    }

    public abstract void coming();
    public abstract void returning();
    public abstract void dayOnePlan();
    public abstract void dayTwoPlan();
    public abstract void dayThirdPlan();
}
