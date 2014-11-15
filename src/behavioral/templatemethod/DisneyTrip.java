package behavioral.templatemethod;


public class DisneyTrip extends Trip {
    @Override
    public void coming() {
        System.out.println("Visitor are going to come by bus.");
    }

    @Override
    public void returning() {
        System.out.println("Visitor are going back by bus.");
    }

    @Override
    public void dayOnePlan() {
        System.out.println("First day, Visitors are going to visit Magic Kingdom." );
    }

    @Override
    public void dayTwoPlan() {
        System.out.println("Second day, Visitors are going to visit Disney Adventure." );
    }

    @Override
    public void dayThirdPlan() {
        System.out.println("Third day, Visitors are going to meet with Various Characters." );
    }
}
