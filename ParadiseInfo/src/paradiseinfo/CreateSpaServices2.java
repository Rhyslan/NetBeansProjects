/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradiseinfo;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class CreateSpaServices2 {
    public static void main(String[] args) {
        String service;
        double price;
        
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        
        firstService = getData(firstService);
        secondService = getData(secondService);
        
        System.out.println("First service details: ");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
        
        System.out.println("Second service details: ");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }
    
    public static SpaService getData(SpaService service) {
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        
        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
    }
}
