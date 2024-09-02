package com.phaete;

public class Service {

    private final Repo repo;

    public Service() {
        this.repo = new Repo();
    }

    public String getArticleNameById(String id) {
        //Article article = repo.getArticleById(id).orElse(new Article("-1", "Article not found")); // or else will sustitute a not found article with a default article
        Article article = repo.getArticleById(id).orElseThrow(); // will throw a "java.util.NoSuchElementException" if the article is not found
        return article.name();
    }
}
