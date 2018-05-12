package com.dev;

// This class acts as a simple factory for creation of different posts
public class PostFactory {

	// Simple factory doesn't need any state tracking.
	// So its best to keep this method as static
	
	public static Post createPost(String type) {

		switch (type) {
			case "blog":
				return new BlogPost();
			case "news":
				return new NewsPost();
			case "product":
				return new ProductPost();
			default:
				throw new IllegalArgumentException("Post type is unknown");
		}
	}
}
