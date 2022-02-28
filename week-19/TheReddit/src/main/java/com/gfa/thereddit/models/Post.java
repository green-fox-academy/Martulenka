package com.gfa.thereddit.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate postDate;

    public Post (String postTitle, String postLink){
     this.postTitle = postTitle;
     this.postLink = postLink;
     this.postScore = 0;
     this.postDate = LocalDate.now();
    }

    public void changeScore(int changeAmount){
        postScore += changeAmount;
    }

}
