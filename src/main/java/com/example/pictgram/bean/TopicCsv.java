package com.example.pictgram.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "ID", "ユーザーID", "パス", "説明", "緯度", "経度" })
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TopicCsv {

    @JsonProperty("ID")
    private Long id;

    @JsonProperty("ユーザーID")
    private Long userId;

    @JsonProperty("パス")
    private String path;

    @JsonProperty("説明")
    private String description;

    @JsonProperty("緯度")
    private Double latitude;

    @JsonProperty("経度")
    private Double longitude;

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