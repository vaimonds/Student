package org.skypro.skyshop.Article;

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
        return getNameArticle() + getTextArticle();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return getNameArticle();
    }
}

