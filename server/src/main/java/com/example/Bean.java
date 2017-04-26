package com.example;

import java.io.Serializable;

/**
 * Created by fengmai on 2017/4/25.
 */

public class Bean implements Serializable {

    //定义的私有属性
    private int Carousel_img1;
    private int Carousel_img2;
    private int Carousel_img3;
    private int Carousel_img4;
    private int Horizontal_rvimg1;
    private int Horizontal_rvimg2;
    private int Horizontal_rvimg3;
    private int Horizontal_rvimg4;
    private int Horizontal_rvimg5;
    private int Hot_img1;
    private String Hot_str;
    private int Hot_img2;
    private int Circle_imgtitle;
    private int Circle_img;
    private String Circle_str;

    public Bean() {
    }

    public Bean(int carousel_img1, int carousel_img2, int carousel_img3, int carousel_img4, int horizontal_rvimg1, int horizontal_rvimg2, int horizontal_rvimg3, int horizontal_rvimg4, int horizontal_rvimg5, int hot_img1, String hot_str, int hot_img2, int circle_imgtitle, int circle_img, String circle_str) {
        Carousel_img1 = carousel_img1;
        Carousel_img2 = carousel_img2;
        Carousel_img3 = carousel_img3;
        Carousel_img4 = carousel_img4;
        Horizontal_rvimg1 = horizontal_rvimg1;
        Horizontal_rvimg2 = horizontal_rvimg2;
        Horizontal_rvimg3 = horizontal_rvimg3;
        Horizontal_rvimg4 = horizontal_rvimg4;
        Horizontal_rvimg5 = horizontal_rvimg5;
        Hot_img1 = hot_img1;
        Hot_str = hot_str;
        Hot_img2 = hot_img2;
        Circle_imgtitle = circle_imgtitle;
        Circle_img = circle_img;
        Circle_str = circle_str;
    }
}
