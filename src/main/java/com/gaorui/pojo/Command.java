package com.gaorui.pojo;

import java.io.Serializable;

/**
 * Created by gaorui on 17/2/12.
 */
public class Command implements Serializable{

        private static final long serialVersionUID = 7590999461767050471L;

    private String actionName;

    public String getActionName() {
        return
                actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}