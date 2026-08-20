package com.ram.HiringPlatform.Controller;

import com.ram.HiringPlatform.Model.Post;
import com.ram.HiringPlatform.repository.PostRepository;
import com.ram.HiringPlatform.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;
    @RequestMapping("/swagger")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
    @GetMapping("/posts")
    public List<Post> getData(){
        return repo.findAll();
    }
    @PostMapping("/post")
    public Post addData(@RequestBody Post post){
        return repo.save(post);
    }
    @GetMapping("/findAll{text}")
    public List<Post> getAll(@PathVariable String text){
        return srepo.searchFindByText(text);
    }
}
