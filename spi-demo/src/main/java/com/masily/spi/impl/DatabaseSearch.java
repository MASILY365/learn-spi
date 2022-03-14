package com.masily.spi.impl;

import com.masily.spi.Search;

/**
 * @author masily
 * @since 2022/3/14 13:28
 */
public class DatabaseSearch implements Search {

    @Override
    public void doc(String keyword) {
        System.out.println("数据库查询：" + keyword);
    }
}
