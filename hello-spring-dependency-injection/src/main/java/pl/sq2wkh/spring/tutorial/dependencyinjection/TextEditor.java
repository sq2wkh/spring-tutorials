package pl.sq2wkh.spring.tutorial.dependencyinjection;

/**
 * Created by adam on 08.06.14.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    // setter aby można było wstrzyknąć spellCheckera
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
