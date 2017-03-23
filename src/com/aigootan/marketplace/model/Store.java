package com.aigootan.marketplace.model;

public class Store {
    private Owner m_owner;
    private String m_id;
    private String m_name;
    private String m_url;
    private long m_totalTransaction;
    private long m_totalSoldProduct;
    private int m_totalEtalase;
    private int m_totalProduct;
    private String m_sendFrom;
    private String m_sendDuration;
    private String m_lastOnline;
    private String m_openSince;
    
    protected Store(final Owner owner, final String id, final String name, final String url,
            final long totalTransaction, final long totalSoldProduct, final int totalEtalase,
            final int totalProduct, final String sendFrom, final String sendDuration,
            final String lastOnline, final String openSince) {
        m_owner = owner;
        m_id = id;
        m_name = name;
        m_url = url;
        m_totalTransaction = totalTransaction;
        m_totalSoldProduct = totalSoldProduct;
        m_totalEtalase = totalEtalase;
        m_totalProduct = totalProduct;
        m_sendFrom = sendFrom;
        m_sendDuration = sendDuration;
        m_lastOnline = lastOnline;
        m_openSince = openSince;
    }

    public Owner getOwner() {
        return m_owner;
    }

    public void setOwner(Owner owner) {
        m_owner = owner;
    }

    public String getId() {
        return m_id;
    }

    public void setId(String id) {
        m_id = id;
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

    public long getTotalTransaction() {
        return m_totalTransaction;
    }

    public void setTotalTransaction(long totalTransaction) {
        m_totalTransaction = totalTransaction;
    }

    public long getTotalSoldProduct() {
        return m_totalSoldProduct;
    }

    public void setTotalSoldProduct(long totalSoldProduct) {
        m_totalSoldProduct = totalSoldProduct;
    }

    public int getTotalEtalase() {
        return m_totalEtalase;
    }

    public void setTotalEtalase(int totalEtalase) {
        m_totalEtalase = totalEtalase;
    }

    public int getTotalProduct() {
        return m_totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        m_totalProduct = totalProduct;
    }

    public String getSendFrom() {
        return m_sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        m_sendFrom = sendFrom;
    }

    public String getSendDuration() {
        return m_sendDuration;
    }

    public void setSendDuration(String sendDuration) {
        m_sendDuration = sendDuration;
    }

    public String getLastOnline() {
        return m_lastOnline;
    }

    public void setLastOnline(String lastOnline) {
        m_lastOnline = lastOnline;
    }

    public String getOpenSince() {
        return m_openSince;
    }

    public void setOpenSince(String openSince) {
        m_openSince = openSince;
    }
        
}
