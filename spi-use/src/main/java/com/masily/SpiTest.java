package com.masily;

import com.masily.spi.Search;

import java.util.ServiceLoader;

/**
 * @author masily
 * @since 2022/3/14 13:31
 */
public class SpiTest {

    public static void main(String[] args) {

        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        for (Search search : load) {
            search.doc("hello world");
        }
    }

}
