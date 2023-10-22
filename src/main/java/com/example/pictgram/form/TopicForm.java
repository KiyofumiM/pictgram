package com.example.pictgram.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.pictgram.validation.constraints.ImageByte;
import com.example.pictgram.validation.constraints.ImageNotEmpty;

import lombok.Data;

// @Data
public class TopicForm {

    private Long id;

    private Long userId;

    @ImageNotEmpty
    @ImageByte(max = 2000000)
    private MultipartFile image;

    private String imageData;

    private String path;

    @NotEmpty
    @Size(max = 1000)
    private String description;
    
    private Double latitude;
    
    private Double longitude;

    private UserForm user;

    private List<FavoriteForm> favorites;
    
    private FavoriteForm favorite;
    
    private List<CommentForm> comments;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public List<FavoriteForm> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<FavoriteForm> favorites) {
		this.favorites = favorites;
	}

	public FavoriteForm getFavorite() {
		return favorite;
	}

	public void setFavorite(FavoriteForm favorite) {
		this.favorite = favorite;
	}

	public List<CommentForm> getComments() {
		return comments;
	}

	public void setComments(List<CommentForm> comments) {
		this.comments = comments;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
    
	

}