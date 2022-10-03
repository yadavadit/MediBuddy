/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Information;

import java.util.ArrayList;

/**
 *
 * @author Aditi Yadav
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;
    
    public EmployeeProfileHistory(){
        this.history = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
  public EmployeeProfile addNewEmployee(EmployeeProfile em){
      
//      EmployeeProfile newEmployee = new EmployeeProfile();
//      history.add(newEmployee);
//      return newEmployee;
        this.history.add(em);
        return em;
  
  }  
  
  
  public EmployeeProfile findName(String emName){
      for(EmployeeProfile em : history){
          if(em.getName().equals(emName)){
              return em;
          }
      }
    return null;
    } 
  
  
// public EmployeeProfile findEmployeeId(String EmployeeId){
//      for(EmployeeProfile em : history){
//          if(em.getEmpID().equals(EmployeeId)){
//              return em;
//          }
//      }
//    return null;
//    } 
 
 public EmployeeProfile findPhoneNumber(String PhoneNumber){
      for(EmployeeProfile em : history){
          if(em.getPhoneNumber().equalsIgnoreCase(PhoneNumber)){
              return em;
          }
      }
    return null;
    } 
 
 public EmployeeProfile findEmailId(String EmailId){
      for(EmployeeProfile em : history){
          if(em.getEmailId().equals(EmailId)){
              return em;
          }
      }
    return null;
    } 

public void deleteEmployee(EmployeeProfile em){
      history.remove(em);
 
}
}
