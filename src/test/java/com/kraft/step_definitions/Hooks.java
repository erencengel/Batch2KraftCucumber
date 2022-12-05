package com.kraft.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("coming from before");
    }

    @After
    public void tearDown(){
        System.out.println("coming from after");
    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("open DB");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("closeDB");
    }



}
