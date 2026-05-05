package com.cloud.main;

import com.cloud.core.Server;
import com.cloud.device.VirtualPrivateServer;
import com.cloud.device.DedicatedServer;
import com.cloud.management.ServerManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServerManager<Server> manager = new ServerManager<>();
        Scanner scanner = new Scanner(System.in);

        VirtualPrivateServer vps1 = new VirtualPrivateServer("103.150.10.1", "ubuntu-vps-01", "Ubuntu Server 22.04 LTS", 150000.0, 2, 4);
        VirtualPrivateServer vps2 = new VirtualPrivateServer("103.150.10.5", "openvpn-router", "Ubuntu Server 20.04 LTS", 90000.0, 1, 1);
        DedicatedServer ds1 = new DedicatedServer("192.168.1.10", "database-master", "CentOS 8", 2500000.0, "Intel Xeon E-2236", "2x 1TB NVMe SSD");

        System.out.println("=== Inisialisasi Sistem ===");
        manager.addServer(vps1);
        manager.addServer(vps2);
        manager.addServer(ds1);

        while (true) {
            System.out.println("\n=== Cloud Network Controller ===");
            System.out.println("1. Tampilkan Rincian Server");
            System.out.println("2. Power ON Semua Server");
            System.out.println("3. Power OFF Semua Server");
            System.out.println("4. Reboot Semua Server");
            System.out.println("5. Keluar");
            System.out.print("Pilih eksekusi: ");

            String opsi = scanner.nextLine();

            if (opsi.equals("1")) {
                manager.showAllServers();
            } else if (opsi.equals("2")) {
                manager.executeMassAction("ON");
            } else if (opsi.equals("3")) {
                manager.executeMassAction("OFF");
            } else if (opsi.equals("4")) {
                manager.executeMassAction("REBOOT");
            } else if (opsi.equals("5")) {
                System.out.println("Menutup koneksi terminal. Selesai.");
                break;
            } else {
                System.out.println("Input tidak valid. Silakan ulangi.");
            }
        }
        
        scanner.close();
    }
}
