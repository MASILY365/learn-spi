package com.masily;

import com.masily.spi.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author masily
 * @since 2022/3/14 13:31
 */
public class SpiTest {

    public static void main(String[] args) {

        ServiceLoader<Search> load = ServiceLoader.load(Search.class);

        // foreach example
        // for (Search search : load) {
        //     search.doc("hello world");
        // }

        // iterator example
        Iterator<Search> searches = load.iterator();
        while (searches.hasNext()) {
            Search search = searches.next();
            search.doc("hello world");
        }

    }

}
