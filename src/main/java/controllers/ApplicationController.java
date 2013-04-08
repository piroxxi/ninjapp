package controllers;

import ninja.Context;
import ninja.Result;
import ninja.Results;

import org.slf4j.Logger;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ApplicationController {

    @Inject
    public Logger logger;

    public Result index(Context context) {
    	logger.debug("Here we are in the index() method");
        return Results.html();
    }

}
