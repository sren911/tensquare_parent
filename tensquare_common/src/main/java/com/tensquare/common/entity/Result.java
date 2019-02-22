package com.tensquare.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: renshuai
 * @date: 2019/2/22 14:03
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private boolean flag;

    private Integer code;

    private String message;

    private Object data;

    public Result(boolean flag,Integer code,  String message) {
        this.code = code;
        this.flag = flag;
        this.message = message;
    }
}
