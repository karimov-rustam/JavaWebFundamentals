package edu.web;

/**
 * Created by R.Karimov on 11/10/17.
 */
public class ApplicationSettings {

    private CssClass _formCssClass;
    private String[] _tabNames;

    public CssClass getFormCssClass() {
        return _formCssClass;
    }

    public void setFormCssClass(CssClass value) {
        _formCssClass = value;
    }

    public String[] getTabNames() {
        return _tabNames;
    }

    public void setTabNames(String[] names) {
        _tabNames = new String[names.length];
        System.arraycopy(names, 0, _tabNames, 0, names.length);
    }
}
