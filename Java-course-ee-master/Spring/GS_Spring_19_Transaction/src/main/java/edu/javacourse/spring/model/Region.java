package edu.javacourse.spring.model;

/**
 * Author: Georgy Gobozov
 * Date: 21.07.13
 */
public class Region {

    private Integer id;
    private String name;

    public Region(String name) {
        this.name = name;
    }

    public Region() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
