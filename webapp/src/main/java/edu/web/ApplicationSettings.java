package edu.web;

import java.util.List;

/**
 * Created by R.Karimov on 11/10/17.
 */
public class ApplicationSettings {

    private CssClass _formCssClass;
    private String[] _tabNames;
    private List<Tab> tabs;

    public CssClass getFormCssClass() {
        return _formCssClass;
    }

    public void setFormCssClass(CssClass value) {
        _formCssClass = value;
    }

//    public String[] getTabNames() {
//        return _tabNames;
//    }
//
//    public void setTabNames(String[] names) {
//        _tabNames = new String[names.length];
//        System.arraycopy(names, 0, _tabNames, 0, names.length);
//    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public List<Tab> getTabs() {
        return tabs;
    }
}
