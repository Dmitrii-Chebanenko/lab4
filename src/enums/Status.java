package enums;

public enum Status {
    WELCOMING,
    SAD,
    MISSING,
    EXPANDED,
    SUDDENLY;

    public static  String getStatus(Status status) {
        return switch(status){
            case WELCOMING -> "приветственные";
            case SAD -> "грустную";
            case MISSING -> "пропавшего";
            case EXPANDED -> "расширялись";
            case SUDDENLY -> "неожиданно";
        };
    }
}
