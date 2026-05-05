package com.cloud.device;

import com.cloud.core.Server;

public class DedicatedServer extends Server {
    private String processor;
    private String storage;

    public DedicatedServer(String ipAddress, String hostname, String os, double monthlyCost, String processor, String storage) {
        super(ipAddress, hostname, os, monthlyCost);
        this.processor = processor;
        this.storage = storage;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Tipe: Dedicated Server");
        System.out.println("Hostname: " + getHostname());
        System.out.println("IP Address: " + getIpAddress());
        System.out.println("OS: " + getOs());
        System.out.println("Prosesor: " + processor);
        System.out.println("Storage: " + storage);
        System.out.println("Biaya Bulanan: Rp" + getMonthlyCost());
    }

    @Override
    public void powerOn() {
        System.out.println("Menyalakan daya pada mesin bare-metal " + getHostname() + "...");
    }

    @Override
    public void powerOff() {
        System.out.println("Memutus daya dari mesin bare-metal " + getHostname() + "...");
    }

    @Override
    public void reboot() {
        System.out.println("Melakukan instruksi hard-reboot pada " + getHostname() + "...");
    }
}
