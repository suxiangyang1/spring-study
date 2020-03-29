package com.soft1851.spring.sprig.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor   //有参
@NoArgsConstructor    //无参
@Builder
public class Forum {
    private Integer forumId;
    private String forumName;
}
