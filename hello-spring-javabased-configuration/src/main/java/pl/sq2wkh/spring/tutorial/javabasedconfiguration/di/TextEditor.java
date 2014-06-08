package pl.sq2wkh.spring.tutorial.javabasedconfiguration.di;

/**
 * Created by adam on 08.06.14.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    // setter aby można było wstrzyknąć spellCheckera
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
