package com.masily.spi.impl;

import com.masily.spi.Search;

/**
 * @author masily
 * @since 2022/3/14 13:28
 */
public class FileSearch implements Search {

    @Override
    public void doc(String keyword) {
        System.out.println("文件查询：" + keyword);
    }
}
