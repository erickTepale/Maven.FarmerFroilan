package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.List;

public class Storage<E extends Edible> {
    List<E> storage;
}
