package com.gfa.thereddit.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long postId;

    private String postTitle;
    private String postLink;
    private long postScore;

    public Post (String postTitle, String postLink){
     this.postTitle = postTitle;
     this.postLink = postLink;
     this.postScore = 0;
    }

}
