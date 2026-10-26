package edu.slsu.it205.lab10;

public class Main {

    public static void main(String[] args) {

        // =========================
        // Adapter Pattern
        // =========================
        System.out.println("=== Adapter Pattern ===");

        LegacyJsonFeed legacyFeed = new LegacyJsonFeed();
        ModernDataSource dataSource = new LegacyJsonAdapter(legacyFeed);

        System.out.println("Fetched data: " + dataSource.fetch());


        // =========================
        // Decorator Pattern
        // =========================
        System.out.println();
        System.out.println("=== Decorator Pattern ===");

        Service service = new LoggingServiceDecorator(new CoreService());

        service.execute("BOOK-001");


        // =========================
        // Strategy Pattern
        // =========================
        System.out.println();
        System.out.println("=== Strategy Pattern ===");

        FeeContext feeContext = new FeeContext(new StandardFee());

        double standardFee = feeContext.calculate(100);
        System.out.println("Standard fee: " + standardFee);

        feeContext.setStrategy(new PremiumFee());

        double premiumFee = feeContext.calculate(100);
        System.out.println("Premium fee: " + premiumFee);


        // =========================
        // Observer Pattern
        // =========================
        System.out.println();
        System.out.println("=== Observer Pattern ===");

        Subject subject = new Subject();

        Observer student = new StudentObserver();
        Observer librarian = new LibrarianObserver();

        subject.registerObserver(student);
        subject.registerObserver(librarian);

        subject.setStatus("AVAILABLE");
        subject.setStatus("BORROWED");
    }
}