package com.aigootan.marketplace.model;

public class Owner {
    private String m_name;
    private String m_url;
    
    public Owner(String name, String url) {
        m_name = name;
        m_url = url;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getUrl() {
        return m_url;
    }

    public void setUrl(String url) {
        m_url = url;
    }
    
    
}
