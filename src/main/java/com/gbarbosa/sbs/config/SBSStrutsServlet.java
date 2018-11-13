package com.gbarbosa.sbs.config;

import org.apache.struts2.dispatcher.servlet.StrutsServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"*.do"})
public class SBSStrutsServlet extends StrutsServlet {

    private static final long serialVersionUID = 4919365268043339311L;

}
