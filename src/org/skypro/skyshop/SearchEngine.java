package org.skypro.skyshop;

import org.skypro.skyshop.Article.Searchable;

public class SearchEngine{
    private Searchable[] searchables;
    private int size = 0;

    public SearchEngine(int capacity) {
        this.searchables = new Searchable[capacity];
    }

    public Searchable[] search(String search) {
        int count = 0;
        Searchable[] resultFound = new Searchable[5];
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                resultFound[count] = searchable;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        return resultFound;
    }

    public void add (Searchable searchable) {
        if (size < searchables.length) {
            searchables[size] = searchable;
            size++;
        } else {
            System.out.println("Архив поиска переполнен! Не удалось добавить элемент.");
        }
    }
}
