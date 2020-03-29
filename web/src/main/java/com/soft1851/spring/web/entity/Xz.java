package com.soft1851.spring.web.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Xz {
    private String id;
    private String desc;
    private Double price;
    private String title;
    private Integer buyCount;
}
