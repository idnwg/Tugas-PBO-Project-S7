package com.cloud.device;

import com.cloud.core.Server;

public class VirtualPrivateServer extends Server {
    private int vCpu;
    private int ram;

    public VirtualPrivateServer(String ipAddress, String hostname, String os, double monthlyCost, int vCpu, int ram) {
        super(ipAddress, hostname, os, monthlyCost);
        this.vCpu = vCpu;
        this.ram = ram;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Tipe: Virtual Private Server (VPS)");
        System.out.println("Hostname: " + getHostname());
        System.out.println("IP Address: " + getIpAddress());
        System.out.println("OS: " + getOs());
        System.out.println("Spesifikasi: " + vCpu + " vCPU, " + ram + "GB RAM");
        System.out.println("Biaya Bulanan: Rp" + getMonthlyCost());
    }

    @Override
    public void powerOn() {
        System.out.println("Memulai proses booting VM " + getHostname() + "...");
    }

    @Override
    public void powerOff() {
        System.out.println("Mematikan VM " + getHostname() + " dengan aman (Graceful Shutdown)...");
    }

    @Override
    public void reboot() {
        System.out.println("Merestart layanan pada VM " + getHostname() + "...");
    }
}
