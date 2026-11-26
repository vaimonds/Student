package org.skypro.skyshop;

import org.skypro.skyshop.Exception.BestResultNotFound;
import org.skypro.skyshop.search.Searchable;

import java.util.*;

public class SearchEngine {
    private Set<Searchable> searchables = new HashSet<>();

    public Set<Searchable> search(String search) {
        Set<Searchable> resultFound = new TreeSet<>(new App.ReverseStringComparator());
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                resultFound.add(searchable);
            }
        }
        return resultFound;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public Searchable findMostRelevant(String s) throws BestResultNotFound {
        String substring = s;
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