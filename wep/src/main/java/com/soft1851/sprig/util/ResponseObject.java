package com.soft1851.sprig.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private Integer code;
    private String msg;
    private Object data;
}
