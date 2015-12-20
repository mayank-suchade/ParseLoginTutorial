package com.awesome.shukla.parselogintutorial;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by Ashish on 2015-12-17.
 */
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        String cKey = "dDkainNHO3ekLduvgRIvAKFjinVUu92YJslGvN2p";
        String aKey = "9lp1ec967kU0kfkL1pPYDhQoBvqaRsVCM2rHeb15";
        Parse.initialize(this, aKey, cKey);

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
