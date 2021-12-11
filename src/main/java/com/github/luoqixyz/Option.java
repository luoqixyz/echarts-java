package com.github.luoqixyz;

import com.github.luoqixyz.style.TextStyle;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Option implements Serializable {
    private static final long serialVersionUID = 4664955083296866542L;

    private Title title;

    private Legend legend;

    private Grid grid;

    private Axis xAxis;

    private CategoryAxis yAxis;

    private Polar polar;

    private RadiusAxis radiusAxis;

    private AngleAxis angleAxis;

    private Radar radar;

    private DataZoom dataZoom;

    private VisualMap visualMap;

    private ToolTip tooltip;

    private AxisPointer axisPointer;

    private ToolBox toolbox;

    private Brush brush;

    private Geo geo;

    private Parallel parallel;

    private SingleAxis singleAxis;

    private TimeLine timeline;

    private Graphic graphic;

    private Calendar calendar;

    private DataSet dataSet;

    private Aria aria;

    private Series series;

    private boolean darkMode;

    private String color;

    private String backgroundColor;

    private TextStyle textStyle;

    private boolean animation;

    private Integer animationThreshold;

    private Integer animationDuration;

    private Integer animationDelayUpdate;

    private StateAnimation stateAnimation;

    private String blendMode;

    private Integer hoverLayerThreshold;

    private boolean useUTC;

    private List<Option> options;

    private Media media;
}
