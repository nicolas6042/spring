package com.domain.exception.index;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class VideoController {
    public List<String> getCollection(){
        ArrayList<String> videos = new ArrayList<>();
        videos.add("Extra movie");
        return videos;
    }
}
