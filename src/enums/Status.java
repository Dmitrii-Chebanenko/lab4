package enums;

public enum Status {
    WELCOMING,
    SAD,
    MISSING,
    EXPANDED,
    SUDDENLY,
    SHRINKED,
    COMFORTABLE,
    UNCOMFORTABLE,
    ;

    public static  String getStatus(Status status) {
        return switch(status){
            case WELCOMING -> "приветственные";
            case SAD -> "грустную";
            case MISSING -> "пропавшего";
            case EXPANDED -> "расширялись";
            case SUDDENLY -> "неожиданно";
            case SHRINKED -> "сжимались";
            case COMFORTABLE -> "удобный";
            case UNCOMFORTABLE -> "некомфортный";
        };
    }
}
