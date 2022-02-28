package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    void save(Post post);

    Post upvote(long postId);

    Post downvote(long postId);

    List<Post> sortByScoreDesc();

}
