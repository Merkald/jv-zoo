package core.basesyntax.zoo;

public final class CompositionOfFeed {
    private final int MAX_AMOUNT_OF_FEED;
    private int amountOfFeed;

    public CompositionOfFeed(int max_amount_of_feed) {
        MAX_AMOUNT_OF_FEED = max_amount_of_feed;
    }

    public int takeFeed(int amount) {
        amountOfFeed-=amount;
        return amountOfFeed;
    }

    public void replenishSupplies(int amount) {

        this.amountOfFeed = amount;
    }
}
