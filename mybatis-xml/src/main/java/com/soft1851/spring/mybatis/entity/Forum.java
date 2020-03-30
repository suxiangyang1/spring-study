package com.soft1851.spring.mybatis.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Forum {
    private Integer forumId;
    private String forumName;
}
