package edu.nau.granroth_m_mitchell_j_anagramapp;

public class Anagram {
    public static int questionCounter = 1;

    public static final String[] EASY_WORDS = {"tone", "tugs", "vein", "wake",
            "host", "idle", ""};

    public static final String[] EASY_WORDS_ANSWERS = {"note", "guts", "vine",
            "weak", "shot", "lied"};


    public static Boolean checkWord( String wordToCheck ) {
        for( int arrayCounter = 0; arrayCounter < 6; arrayCounter++ ) {
            if( wordToCheck.equals(EASY_WORDS_ANSWERS[arrayCounter]) ) {
                return true;
            }
            else {
                break;
            }
        }

        return false;
    }

    public static int updateQuestionCounter() {
        return questionCounter ++;
    }

    public static int getQuestionCounter() {
        return questionCounter;
    }

}
