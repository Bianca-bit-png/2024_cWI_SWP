package at.htldornbirn_4cwi.swp.oberserver;

public class NewsAgency {

    private final String name;

    public NewsAgency(String name) {
            this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
