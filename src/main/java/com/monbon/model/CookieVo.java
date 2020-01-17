package com.monbon.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("CookieVo")
public class CookieVo {

    private String  key;
    private String  value;
    private Long expire;
    private String  name;

    private String salary;
    private String dept;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CookieVo{");
        sb.append('}');
        return sb.toString();
    }
}
