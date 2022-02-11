package com.awsbasic.book.springboot.web.domain.post;


import org.springframework.data.jpa.repository.*;

public interface PostRepository extends JpaRepository<Posts, Long> {
}
