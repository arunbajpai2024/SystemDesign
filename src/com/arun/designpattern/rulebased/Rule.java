package com.arun.designpattern.rulebased;

public interface Rule <T>{
    boolean matches(T input);
    void apply(T input);
}
