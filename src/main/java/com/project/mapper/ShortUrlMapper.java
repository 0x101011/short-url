package com.project.mapper;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.domain.ShortUrl;
import org.apache.ibatis.annotations.Param;

public interface ShortUrlMapper extends BaseMapper<ShortUrl> {

    ShortUrl findByHashValue(@Param("hashValue")String hashValue);

    List<String> findAllHashValue();

}