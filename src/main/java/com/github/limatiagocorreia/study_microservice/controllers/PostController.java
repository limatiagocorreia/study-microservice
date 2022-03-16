package com.github.limatiagocorreia.study_microservice.controllers;

import com.github.limatiagocorreia.study_microservice.Post;
import com.github.limatiagocorreia.study_microservice.repositories.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    private final PostRepository postsRepository = new PostRepository();

    @GetMapping
    public List<Post> getPosts(){
        System.out.println("Listando todos os posts");
        return postsRepository.getPosts();
    }

    @GetMapping("{post_id}")
    public Post getById(@PathVariable Long post_id){
        System.out.println("Listando o post de id= "+ post_id);
        return postsRepository.getById(post_id);
    }

    @DeleteMapping("delete/{post_id}")
    public void deletePost(@PathVariable Long post_id){
        System.out.println("Apagando o post de id= "+ post_id);
        postsRepository.deleteById(post_id);
    }

    @PostMapping("create")
    public Long createPost(@RequestBody Post post){
        System.out.println("Criando o post " + post.toString());
        return postsRepository.createPost(post);
//        return null;
    }

    @PutMapping("update")
    public Post updatePost(@RequestBody Post post){
        System.out.println("Atualizando o post " + post.toString());
        return null;
    }
}
