package edu.slsu.it205.lab10;

public class LegacyJsonAdapter implements ModernDataSource {

    private final LegacyJsonFeed legacyFeed;

    public LegacyJsonAdapter(LegacyJsonFeed legacyFeed) {
        this.legacyFeed = legacyFeed;
    }

    @Override
    public String fetch() {
        return legacyFeed.pull();
    }
}