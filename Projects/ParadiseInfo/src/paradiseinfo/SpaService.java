/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradiseinfo;

/**
 *
 * @author dylan
 */
public class SpaService {
    private String serviceDescription = "xxx";
    private double price = 0;
    
    public void setServiceDescription(String service) {
        serviceDescription = service;
    }
    
    public void setPrice(double servicePrice) {
        price = servicePrice;
    }
    
    public String getServiceDescription() {
        return serviceDescription;
    }
    
    public double getPrice() {
        return price;
    }
}
