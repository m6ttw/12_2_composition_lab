public enum EngineType {
    PETROL("Petrol"),
    DIESEl("Diesel"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid"),
    ;

    private final String name;

    EngineType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
