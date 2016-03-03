/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {
     
    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String country; 
    private String city;  
    private Map<String,String> countries;
    private Map<String,String> cities;
     
    @PostConstruct
    public void init() {
        countries  = new HashMap<String, String>();
        countries.put("1", "1");
        countries.put("2", "2");
        countries.put("3", "3");
        countries.put("4", "4");
        countries.put("5", "5");
        countries.put("6", "6");
        countries.put("7", "7");
        countries.put("8", "8");
        countries.put("9", "9");
        countries.put("10", "10");
         
        Map<String,String> map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("1", map);
         
        map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("2", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("3", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("4", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("5", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("6", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("7", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("8", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("9", map);
        
         map = new HashMap<String, String>();
        map.put("11:00", "11:00");
        map.put("12:00", "12:00");
        map.put("13:00", "13:00");
        map.put("14:00", "14:00");
        map.put("15:00", "15:00");
        map.put("16:00", "16:00");
        map.put("17:00", "17:00");
        data.put("10", map);
         
       
    }
 
    public Map<String, Map<String, String>> getData() {
        return data;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public Map<String, String> getCountries() {
        return countries;
    }
 
    public Map<String, String> getCities() {
        return cities;
    }
 
    public void onCountryChange() {
        if(country !=null && !country.equals(""))
            cities = data.get(country);
        else
            cities = new HashMap<String, String>();
    }
     
    public void displayLocation() {
        FacesMessage msg;
        if(city != null && country != null)
            msg = new FacesMessage("Selected", city + " of " + country);
        else
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "No selecciono la hora."); 
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
}
