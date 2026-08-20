package com.ram.HiringPlatform.repository;

import com.ram.HiringPlatform.Model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchRepository {
    List<Post> searchFindByText(String text);
}
