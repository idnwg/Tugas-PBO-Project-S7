package com.cloud.management;

import java.util.ArrayList;
import java.util.List;
import com.cloud.core.Server;

public class ServerManager<T extends Server> {
    private List<T> serverList;

    public ServerManager() {
        this.serverList = new ArrayList<>();
    }

    public void addServer(T server) {
        serverList.add(server);
        System.out.println("Berhasil mendata server: " + server.getHostname());
    }

    public void showAllServers() {
        System.out.println("\n=== Data Infrastruktur Cloud ===");
        if (serverList.isEmpty()) {
            System.out.println("Tidak ada server yang terdaftar.");
            return;
        }
        for (T server : serverList) {
            server.displaySpecs();
            System.out.println("---------------------------");
        }
    }

    public void executeMassAction(String action) {
        System.out.println("\n=== Mengeksekusi Perintah: " + action + " ===");
        for (T server : serverList) {
            if (action.equalsIgnoreCase("ON")) {
                server.powerOn();
            } else if (action.equalsIgnoreCase("OFF")) {
                server.powerOff();
            } else if (action.equalsIgnoreCase("REBOOT")) {
                server.reboot();
            }
        }
    }
}
