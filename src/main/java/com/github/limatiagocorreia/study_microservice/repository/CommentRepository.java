package com.github.limatiagocorreia.study_microservice.repository;

import com.github.limatiagocorreia.study_microservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

}
