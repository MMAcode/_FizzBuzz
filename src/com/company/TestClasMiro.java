package com.company;

public class TestClasMiro {
    public String strPu = "public strPu with value by default";
    private String strPr = "public strPr with value by default";
    private String strCo;

    public TestClasMiro(String content) {
        this.strCo = content;
    }

    public String getStrPu() {
        return strPu;
    }

    public void setStrPu(String strPu) {
        this.strPu = strPu;
    }

    public String getStrPr() {
        return strPr;
    }

    public void setStrPr(String strPr) {
        this.strPr = strPr;
    }

    public String getStrCo() {
        return strCo;
    }

    public void setStrCo(String strCo) {
        this.strCo = strCo;
    }
}
