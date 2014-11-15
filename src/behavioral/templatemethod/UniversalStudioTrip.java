package behavioral.templatemethod;


public class UniversalStudioTrip extends Trip {
    @Override
    public void coming() {
        System.out.println("Visitor are going to come by car.");
    }

    @Override
    public void returning() {
        System.out.println("Visitor are going back by car.");
    }

    @Override
    public void dayOnePlan() {
        System.out.println("First day, Visitor are going visit The Wizarding world of Harry Potter.");
    }

    @Override
    public void dayTwoPlan() {
        System.out.println("Second day, Visitor are going visit The Wizarding world of Harry Potter.");
    }

    @Override
    public void dayThirdPlan() {
        System.out.println("Third day, Visitor are going visit The Wizarding world of Harry Potter.");
    }
}
