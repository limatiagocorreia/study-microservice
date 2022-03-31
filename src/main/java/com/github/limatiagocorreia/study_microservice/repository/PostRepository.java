package com.github.limatiagocorreia.study_microservice.repository;

import com.github.limatiagocorreia.study_microservice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
