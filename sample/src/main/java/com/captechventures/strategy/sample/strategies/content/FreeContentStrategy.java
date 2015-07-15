package com.captechventures.strategy.sample.strategies.content;

import com.captechventures.strategy.Strategy;

@Strategy
public class FreeContentStrategy implements ContentStrategy {

    @Override
    public String getContent() {
        return "Free Lorem Ipsum";
    }

}