import java.util.*;
public class LyricWordUsingGeneric {
    private static final Word[] lyric={
            new Word("you",1),new Word("say", 2),new Word("it",3),
            new Word("best",4),new Word("When",5),new Word("you",6),
            new Word("say",7),new Word("nothing",8),new Word("at",9),
            new Word("all",10)
    };

    public static void main(String[] args) {
        List<Word> lyric = new ArrayList<>();
        for (Word w : lyric)
            lyric.add(w);

            for (Word w : lyric) {
                System.out.print(w.getValue() + ", "+ w.getPosition());

            }
        }
    }

