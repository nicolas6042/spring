package com.domain.exception.index;

import java.util.List;

/**
 * @author mbaranowicz
 */
public class IndexExceptionRunner {
    public static void main(String []args){
        VideoController videoController = new VideoController();
        List<String> collection = videoController.getCollection();

        if(collection.size() > 2) {
            String movie = collection.get(0);
            System.out.println(movie);

            String movie2 = collection.get(2);
            System.out.println(movie2);
        }
    }
}
