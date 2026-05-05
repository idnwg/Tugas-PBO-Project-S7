package com.cloud.core;

public abstract class Server implements NetworkDevice {
    private String ipAddress;
    private String hostname;
    private String os;
    private double monthlyCost;

    public Server(String ipAddress, String hostname, String os, double monthlyCost) {
        this.ipAddress = ipAddress;
        this.hostname = hostname;
        this.os = os;
        this.monthlyCost = monthlyCost;
    }

    public String getIpAddress() { 
        return ipAddress; 
    }
    
    public void setIpAddress(String ipAddress) { 
        this.ipAddress = ipAddress; 
    }
    
    public String getHostname() { 
        return hostname; 
    }
    
    public void setHostname(String hostname) { 
        this.hostname = hostname; 
    }
    
    public String getOs() { 
        return os; 
    }
    
    public void setOs(String os) { 
        this.os = os; 
    }
    
    public double getMonthlyCost() { 
        return monthlyCost; 
    }
    
    public void setMonthlyCost(double monthlyCost) { 
        this.monthlyCost = monthlyCost; 
    }

    public abstract void displaySpecs();
}
