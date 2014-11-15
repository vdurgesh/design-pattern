package behavioral.templatemethod;


public class SeaworldTrip extends Trip {

    @Override
    public void coming() {
        System.out.println("Visitor are going to come by air.");
    }

    @Override
    public void returning() {
        System.out.println("Visitor are going back by air.");
    }

    @Override
    public void dayOnePlan() {
        System.out.println(" First day, Visitor are going visit Empire of the Penguin.");
    }

    @Override
    public void dayTwoPlan() {
        System.out.println("Second day, Visitor are going visit Manta.");
    }

    @Override
    public void dayThirdPlan() {
        System.out.println("Third day, Visitor are going visit Underwater.");
    }
}
