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
    
  public EmployeeProfile addNewEmployee(){
      
      EmployeeProfile newEmployee = new EmployeeProfile();
      history.add(newEmployee);
      return newEmployee;
      
  }  
  
  public void deleteEmployee(EmployeeProfile em){
      history.remove(em);
}
  
}
