package com.github.limatiagocorreia.study_microservice.repositories;

import com.github.limatiagocorreia.study_microservice.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {

    private List<Post> posts;

    public PostRepository() {
        this.load();
    }

    private void load() {
        posts = new ArrayList<Post>();

        Post post = new Post();
        post.setId(1L);
        post.setTitle("title");
        post.setAuthor("author");

        posts.add(post);

        post = new Post();
        post.setId(3L);
        post.setTitle("title3");
        post.setAuthor("author3");

        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Post getById(Long post_id) {
        return posts
                .stream()
                .filter(post -> post.getId().equals(post_id))
                .findFirst()
                .orElse(null);
    }

    public void deleteById(Long post_id) {
        posts.removeIf(item -> item.getId().equals(post_id));
    }

}
