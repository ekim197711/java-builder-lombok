package com.example.javabuildervsconstructor.space;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain=true, fluent = true, prefix = "foolishprefix")
@Data
public class Asteroid {
    private String foolishprefixName;
    private Double foolishprefixSpeed;

    private Integer radius;

    public Integer radius() {
        return radius;
    }

    public Asteroid radius(Integer radius) {
        this.radius = radius;
        return this;
    }
}
