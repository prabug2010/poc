package com.api.testing.codes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post2Pojo {
	List<PostExamplePojo> MovieBooking;

	public List<PostExamplePojo> getMovieBooking() {
		return MovieBooking;
	}

	public void setMovieBooking(List<PostExamplePojo> movieBooking) {
		MovieBooking = movieBooking;
	}

	@Override
	public String toString() {
		return "Post2Pojo [MovieBooking=" + MovieBooking + "]";
	}

}
