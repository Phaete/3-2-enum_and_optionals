package com.phaete;

import java.util.List;
import java.util.Optional;

public class Repo {

    List<Article> articles = List.of(
            new Article("1", "My First Article"),
            new Article("2", "My Second Article")
    );

    public Optional<Article> getArticleById(String id){
        for (Article article : articles) {
            if (article.id().equals(id)) {
                return Optional.of(article);
            }
        }
        return Optional.empty(); // returns an empty optional, aka an "empty box"
    }
}
