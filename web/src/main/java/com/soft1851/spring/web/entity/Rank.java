package com.soft1851.spring.web.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Rank {
    private  Integer id;
    private  String title;
    private  String author;
    private  String pic;
    private  String duration;
}
