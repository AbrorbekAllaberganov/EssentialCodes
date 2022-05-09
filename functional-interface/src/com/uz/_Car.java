package com.uz;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class _Car {
    public static void main(String[] args) {
        Car car=new Car(1,"BMW",new Date());
        getInfo.accept(car);
        showId.accept(car,true);
        showId.accept(car,false);
    }

    static Consumer<Car> getInfo = car->
            System.out.println("Id: "+car.getId()+"\nModel: "+car.getModel()+"\n" +
                    "Date: "+ car.getMadeDate());

    static BiConsumer<Car,Boolean> showId= (car,isVisible)->
            System.out.println("Id: "+(isVisible?car.getId():"****")+"\n" +
                    "Model: "+car.getModel()+"\nDate: "+car.getMadeDate());

    static class Car {
        private int id;
        private String model;
        private Date madeDate;

        public Car(int id, String model, Date madeDate) {
            this.id = id;
            this.model = model;
            this.madeDate = madeDate;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Date getMadeDate() {
            return madeDate;
        }

        public void setMadeDate(Date madeDate) {
            this.madeDate = madeDate;
        }
    }
}
