package enums;

public enum QuestionWord {
    WHY,
    HOW,
    HOWMATCH,
    WHERE,
    WHEN,
    WHO;
    public static String getQuestionWord(QuestionWord question){
        return switch(question){
            case WHY -> "почему";
            case HOW -> "как";
            case HOWMATCH -> "сколько";
            case WHERE -> "где";
            case WHEN -> "когда";
            case WHO -> "кто";
        };
    }
}
