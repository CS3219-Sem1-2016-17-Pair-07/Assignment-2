package CS3213;

import java.util.HashSet;

/**
 * Created by Pair 7 on 3/9/2016
 */
public class RequiredWords {
	
    private HashSet<String> _requiredWords;
    private static RequiredWords _instatnce;
    
    private RequiredWords() {
        this._requiredWords = new HashSet<String>();
    }

    public static RequiredWords getRequiredWords() {
        if (_instatnce == null) {
            _instatnce = new RequiredWords();
        }

        return _instatnce;
    }

    public void addRequiredWords(String word) {
        assert(word != null);
        this._requiredWords.add(word);
    }

    public void removeRequiredWords(String word) {
        assert(word != null);
        this._requiredWords.remove(word);
    }

    public boolean isRequiredWord(String word) {
        assert(word != null);
        return this._requiredWords.contains(word);
    }
}
