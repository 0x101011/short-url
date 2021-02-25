package com.project.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yyy
 */
@Data
@AllArgsConstructor
public class ShortUrlVO {
    private String hashValue;

    private String url;
}
