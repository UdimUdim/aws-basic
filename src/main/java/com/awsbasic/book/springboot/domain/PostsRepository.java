package com.awsbasic.book.springboot.domain;


import org.springframework.data.jpa.repository.*;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
