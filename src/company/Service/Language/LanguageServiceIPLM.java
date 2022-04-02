package company.Service.Language;

import company.Model.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageServiceIPLM implements LanguageService {
    public static List<Language> languageList = new ArrayList<>();

    @Override
    public void save(Language language) {
        languageList.add(language);
    }

    @Override
    public void deleteById(int id) {
        languageList.remove(id);
    }

    @Override
    public List<Language> show() {
        return languageList;
    }
}
