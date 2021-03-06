package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @Override
    public void save(Post post){
        postRepository.save(post);
    }

    @Override
    public Post upvote(long postId) {
        Post post = postRepository.findById(postId)
                .orElse(null);

        post.changeScore(1);

        return postRepository.save(post);
    }

    @Override
    public Post downvote(long postId) {
        Post post = postRepository.findById(postId)
                .orElse(null);

        post.changeScore(-1);

        return postRepository.save(post);
    }

    @Override
    public List<Post> sortByScoreDesc(){
        return postRepository.findByOrderByPostScoreDesc();
    }

}
