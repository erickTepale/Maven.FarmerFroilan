package com.zipcodewilmington.froilansfarm.Pojo;

public class Farm {
   private Farm INSTANCE;
   private Tractor tractor;
   private Field field;
   private Stable[] stables;
   private ChickenCoop[] coops;
   private CropDuster cropDuster;

    private Farm(){
        Field field = new Field();

        CropRow row1 = new CropRow();
        CropRow row2 = new CropRow();
        CropRow row3 = new CropRow();
        CropRow row4 = new CropRow();
        CropRow row5 = new CropRow();

        field.addRow(row1);
        field.addRow(row2);
        field.addRow(row3);
        field.addRow(row4);
        field.addRow(row5);

        Tractor kubota = new Tractor();
        CropDuster dusty = new CropDuster();

        Garage garage = new Garage();

        garage.add(kubota);
        garage.add(dusty);


        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();

        stable1.addHorse(horse1);
        stable1.addHorse(horse2);
        stable1.addHorse(horse3);
        stable2.addHorse(horse4);
        stable2.addHorse(horse5);
        stable2.addHorse(horse6);
        stable3.addHorse(horse7);
        stable3.addHorse(horse8);
        stable3.addHorse(horse9);
        stable3.addHorse(horse10);

        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chicken15 = new Chicken();

        chickenCoop1.addChicken(chicken1);
        chickenCoop1.addChicken(chicken2);
        chickenCoop1.addChicken(chicken3);
        chickenCoop1.addChicken(chicken4);
        chickenCoop2.addChicken(chicken5);
        chickenCoop2.addChicken(chicken6);
        chickenCoop2.addChicken(chicken7);
        chickenCoop2.addChicken(chicken8);
        chickenCoop3.addChicken(chicken9);
        chickenCoop3.addChicken(chicken10);
        chickenCoop3.addChicken(chicken11);
        chickenCoop3.addChicken(chicken12);
        chickenCoop4.addChicken(chicken13);
        chickenCoop4.addChicken(chicken14);
        chickenCoop4.addChicken(chicken15);


    }


    public Farm getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Farm();
        }
        return INSTANCE;
    }

    public Tractor getTractor(){
        return INSTANCE.tractor;
    }

    public CropDuster getCropDuster(){
        return INSTANCE.cropDuster;
    }

    public Field getField(){
        return INSTANCE.field;
    }

    public ChickenCoop[] getCoops(){
        return INSTANCE.coops;
    }

    public Stable[] getStables(){
        return INSTANCE.stables;
    }







}
