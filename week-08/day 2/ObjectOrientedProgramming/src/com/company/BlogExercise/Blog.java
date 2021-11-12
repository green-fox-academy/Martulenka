package com.company.BlogExercise;

import com.company.FarmExercise.Animal;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    /*Reuse your BlogPost class
    Create a Blog class which can:
    store a list of BlogPosts
    and has the following methods:
    add(BlogPost) -> adds a BlogPost to the list
    delete(int) -> deletes the BlogPost from the given index
    update(int, BlogPost) -> replaces an item at the given index with a new BlogPost*/

    List<BlogPost> listOfPosts = new ArrayList<>();

    public void add (BlogPost newPost){
        listOfPosts.add(newPost);
        System.out.println("New Post: " + newPost.blogPostTitle);
    }

    public void delete (int blogPostIndex) {
        System.out.println(listOfPosts.get(blogPostIndex).blogPostTitle + " was removed.");
        listOfPosts.remove(blogPostIndex);
    }

    public void update (int blogPostIndex, BlogPost newPost){
        System.out.println(listOfPosts.get(blogPostIndex).blogPostTitle + " was replaced by ");
        listOfPosts.remove(blogPostIndex);
        listOfPosts.add(blogPostIndex, newPost);
        System.out.println(listOfPosts.get(blogPostIndex).blogPostTitle);
    }

    public static void main(String[] args) {

        Blog myBlog = new Blog();

        myBlog.add(new BlogPost("John Doe","Lorem Ipsum","Lorem ipsum dolor sit amet.","2000.05.04."));
        myBlog.add(new BlogPost("Tim Urban","Wait but why","A popular long-form, stick-figure-illustrated blog about almost everything.","2010.10.10."));
        myBlog.add(new BlogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump","Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28."));

        myBlog.delete(1);

        myBlog.update(0,new BlogPost("Erin Morgenstern","The Night Circus","You may tell a tale that takes up residence in someone’s soul, becomes their blood and self and purpose. That tale will move them and drive them and who knows what they might do because of it, because of your words.","2011.09.11"));
    }
}
