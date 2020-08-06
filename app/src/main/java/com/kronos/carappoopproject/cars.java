package com.kronos.carappoopproject;

import java.io.Serializable;

public class cars implements Serializable {
    private String car_model;
    private String company;
    private Integer capacity;
    private Integer max_speed;
    private Integer car_image;

    public cars(String inputModel, String companyInput,Integer capacityInput,Integer max_speedInput,Integer car_imageInput)
    {
        this.car_model=inputModel;
        this.company=companyInput;
        this.capacity=capacityInput;
        this.max_speed = max_speedInput;
        this.car_image = car_imageInput;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getCompany() {
        return company;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getMax_speed() {
        return max_speed;
    }

    public Integer getCar_image() {
        return car_image;
    }
}
