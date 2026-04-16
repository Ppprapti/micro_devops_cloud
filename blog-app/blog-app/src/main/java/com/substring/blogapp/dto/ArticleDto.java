package com.substring.blogapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.substring.blogapp.entity.Status;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDto {
    private Long id;
    private String title;
    private String shortDesc;
    private String content;
    private Boolean paid;
    private Double price;
    private Double rating;
    private Status status;
    private Integer readingMinutes;
    //update only:
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  Long categoryId;

}
