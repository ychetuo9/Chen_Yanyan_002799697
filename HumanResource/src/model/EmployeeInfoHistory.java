/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import ui.ViewJPanel;

/**
 *
 * @author yanyanchen
 */
public class EmployeeInfoHistory {
    private ArrayList<EmployeeInfo> history;
    
    public EmployeeInfoHistory(){
        this.history = new ArrayList<EmployeeInfo>();
    }

    public ArrayList<EmployeeInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeInfo> history) {
        this.history = history;
    }
    
    public EmployeeInfo addNewEmployee(){
        EmployeeInfo newEmployee = new EmployeeInfo();
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(EmployeeInfo ei){
        history.remove(ei);
    }
    
    public EmployeeInfo updateEmployee(EmployeeInfo ei){
        EmployeeInfo updateEmployee = new EmployeeInfo();
        history.add(updateEmployee);
        history.remove(ei);
        return updateEmployee;
    }
    
    
    public ArrayList<EmployeeInfo> searchEmployeeByName(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getName().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
    public ArrayList<EmployeeInfo> searchEmployeeByID(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getEmployeeId().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
    public ArrayList<EmployeeInfo> searchEmployeeByAge(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getAge().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
    public ArrayList<EmployeeInfo> searchEmployeeByGender(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getGender().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
    public ArrayList<EmployeeInfo> searchEmployeeByLevel(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getLevel().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
    public ArrayList<EmployeeInfo> searchEmployeeByTeam(String str){
        ArrayList<EmployeeInfo> result =new ArrayList<>(); 
        for(EmployeeInfo i:history){
            if(i.getTeamInfo().equalsIgnoreCase(str)){
                result.add(i);
            }
        }
        return result;
    }
    
}
