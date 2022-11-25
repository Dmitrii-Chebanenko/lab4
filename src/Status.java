public enum Status {
    WELCOMING,
    SAD,
    MISSING,
    EXPANDED;

    public static  String getStatus(Status status) {
        return switch(status){
            case WELCOMING -> "приветственные";
            case SAD -> "грустную";
            case MISSING -> "пропавшего";
            case EXPANDED -> "расширялись";
        };
    }
}
