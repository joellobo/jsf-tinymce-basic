package com.example.demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class Index {
    String text;
    String textProcess;

    public String getTextProcess() {
        return textProcess;
    }

    public void setTextProcess(String textProcess) {
        this.textProcess = textProcess;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String save() {
        this.textProcess = "HTML:" + this.text;
        return "result";
    }

}
