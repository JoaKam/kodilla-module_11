package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .roll("With sezam")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Chili")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String rollType = bigmac.getRoll();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("With sezam", rollType);
    }
}
