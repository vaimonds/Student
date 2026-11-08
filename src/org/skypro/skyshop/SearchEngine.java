package org.skypro.skyshop;

import org.skypro.skyshop.Exception.BestResultNotFound;
import org.skypro.skyshop.search.Searchable;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables = new ArrayList<>();

    public List<Searchable> search(String search) {
        int count = 0;
        List<Searchable> resultFound = new ArrayList<>();
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                resultFound.add(searchable);
                count++;
            }
        }
        return resultFound;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public Searchable findMostRelevant(String s) throws BestResultNotFound {
        String substring = s;
        ;
        for (Searchable searchable : searchables) {
            String str = searchable.getSearchTerm();
            int quantity = 0;
            int index = 0;
            int indexSubstring = str.indexOf(substring, index);

            while (indexSubstring != -1) {
                quantity++;
                index = indexSubstring + substring.length();
                indexSubstring = str.indexOf(substring, index);
            }

            // Предположим что если количество >= 3, то объект считается подходящим
            if (quantity >= 3) {
                return searchable;
            }
        }
        throw new BestResultNotFound("Для поискового запроса: ( " + substring + " ) не нашлось подходящей статьи");
    }
}