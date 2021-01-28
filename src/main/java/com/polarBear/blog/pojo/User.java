package com.polarBear.blog.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User implements Serializable {
    private String username;
    private Integer age;
    private Integer gender;


}
