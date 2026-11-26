package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.Searchable;

import java.util.Comparator;
import java.util.Objects;

public final class Article implements Searchable {
    private final String nameArticle;
    private final String textArticle;

    public Article(String nameArticle, String textArticle) {
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    @Override
    public String toString() {
        return getNameArticle() + "\n" + getTextArticle();
    }

    @Override
    public String getSearchTerm() {
        return getNameArticle() + "\n" + getTextArticle();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return getNameArticle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Article article = (Article) o;
        return Objects.equals(nameArticle, article.nameArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameArticle);
    }

}