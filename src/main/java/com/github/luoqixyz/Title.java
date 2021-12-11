package com.github.luoqixyz;

import com.github.luoqixyz.style.SubtextStyle;
import com.github.luoqixyz.style.TextStyle;
import lombok.Data;

@Data
public class Title {
    private boolean show;

    private String text;

    private String link;

    private TextStyle textStyle;

    private String subtext;

    private String sublink;

    private String subtarget;

    private SubtextStyle subtextStyle;

    private String textAlign;

    private String textVerticalAlign;

    private boolean triggerEvent;

    private Double[] padding;

    private Double itemGap;

    private Integer zlevel;

    private Integer z;

    private String left;

    private String top;

    private String right;

    private String bottom;

    private String backgroundColor;

    private String borderColor;

    private Double borderWidth;

    private Double borderRadius;

    private Double shadowColor;

    private Double shadowOffsetX;

    private Double shadowOffsetY;



}
