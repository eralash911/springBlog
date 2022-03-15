package com.itproger.bloggoshan.repo;

import com.itproger.bloggoshan.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository  <Post, Long > {
}
