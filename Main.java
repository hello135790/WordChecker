import java.util.ArrayList;
    
public class Main {
    public static void main(String[] args)
    {
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("to");
        letters.add("too");
        letters.add("stool");
        letters.add("tools");
        System.out.println(letters);
        WordChecker v = new WordChecker(letters);
        System.out.println(v.isWordChain());
        
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("catch");
        palabras.add("bobcat");
        palabras.add("catchacat");
        palabras.add("cat");
        palabras.add("at");
        System.out.println(palabras);
        WordChecker y = new WordChecker(palabras);
        System.out.println(y.createList("cat"));
        System.out.println(y.createList("catch"));
        System.out.println(y.createList("dog"));
    }
}