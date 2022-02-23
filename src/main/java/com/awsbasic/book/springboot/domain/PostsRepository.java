package com.awsbasic.book.springboot.domain;


import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
