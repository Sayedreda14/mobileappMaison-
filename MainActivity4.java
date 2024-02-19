package com.example.agriculturalautomationsystemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;
import  com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

public class MainActivity4 extends AppCompatActivity {
    LineChart mpLineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mpLineChart=(LineChart) findViewById(R.id.line_chart);
        LineDataSet lineDataSet1 =new LineDataSet(dataValues1(),"");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);
        LineData data = new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();
    }
    private ArrayList<Entry> dataValues1()
    {
        ArrayList<Entry> dataVals=new ArrayList<Entry>();
        dataVals.add(new Entry (0,20));
        dataVals.add(new Entry (1F, 20.1F));
        dataVals.add(new Entry (2F,20.2F));
        dataVals.add(new Entry (3F,20F));
        dataVals.add(new Entry (4F,20F));
        dataVals.add(new Entry (5F,20.1F));
        dataVals.add(new Entry (6F,20.05F));
        dataVals.add(new Entry (7F,20.06F));
        dataVals.add(new Entry (8F,20.03F));
        return dataVals;
    }
}