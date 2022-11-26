public enum QuestionWord {
    WHY,
    WHAT,
    WHERE,
    HOW,
    WHO,
    HOWMATCH,
    WHEN;

    public static String getQuestionWord(QuestionWord question){
        return switch(question){
            case WHY -> "почему";
            case WHAT -> "что";
            case WHEN -> "когда";
            case WHERE -> "где";
            case HOW -> "как";
            case WHO -> "кто";
            case HOWMATCH -> "как много";
        };
    }
}
