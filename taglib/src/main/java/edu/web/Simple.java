package edu.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by R.Karimov on 11/15/17.
 */
public class Simple extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        PageContext ctx = (PageContext) getJspContext();
        ctx.getOut().write("Hello from this tag");
    }
}
