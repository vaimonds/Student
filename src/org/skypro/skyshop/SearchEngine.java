package org.skypro.skyshop;

import org.skypro.skyshop.Exception.BestResultNotFound;
import org.skypro.skyshop.search.Searchable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngine {
    private List<Searchable> searchables = new ArrayList<>();
    public Map<String, Searchable> search(String search) {
        //List<Searchable> resultFound = new ArrayList<>();
        Map<String, Searchable> resultFound = new TreeMap<>();
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                resultFound.put(searchable.getName(), searchable);
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