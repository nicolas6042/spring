package com.domain.patterns.strategy.social;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("YGeneration");
        User zGeneration = new ZGeneration("ZGeneration");
        //When

        String millenialsShare = millenials.sharePost();
        System.out.println(millenialsShare);
        String yGenerationShare = yGeneration.sharePost();
        System.out.println(yGenerationShare);
        String zGenerationShare = zGeneration.sharePost();
        System.out.println(zGenerationShare);
        //Then

        assertEquals("TWITTER",millenialsShare);
        assertEquals("FACEBOOK",yGenerationShare);
        assertEquals("SNAPCHAT",zGenerationShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("Millenials");
        //When
        String millenialsShare = millenials.sharePost();
        millenials.setSharePost(new FacebookPublisher());
        millenialsShare = millenials.sharePost();
        //Then

        assertEquals("FACEBOOK",millenialsShare);
    }
}
