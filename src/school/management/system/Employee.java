
package school.management.system;

import java.util.ArrayList;



public class Employee {
    
    // array to set Id 
    public static ArrayList<Integer> idArray = new ArrayList<>();
    
    
    private String Name;
    private int id;
    private String address;
    private String phone;
    private String email;
    private double basicSalary;
    private double liveExpensive;
    private String password;
    
    
    public int numberOfloop ;

    public Employee() {
        this.basicSalary = 3000;
        this.liveExpensive = liveExpenive();
        this.id =  batid();
        numberOfloop=0;
    }

    public Employee(String Name, String address, String phone, String email, String password) {
        this.Name = Name;
       this.id =  batid();
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.basicSalary = 3000;
        this.liveExpensive = liveExpenive();
        numberOfloop=0;
        
    }
    
      // to set ID for the employee
    public int batid(){
        
        if (numberOfloop == 0)
                 idArray.add(numberOfloop);
        
        int index1 = idArray.size()-1;
        
        idArray.add(index1,(numberOfloop+100));
        numberOfloop++;
        return numberOfloop+100;
//        int size = idArray.size(); 
//        idArray.add(size,(size+99));
//        
//        return idArray.get(size-1);
    }
   
    
    public double liveExpenive()
    {
    return this.basicSalary * 0.1;
    }

    public int getId() {
        return id;
    }
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", id=" + id + ", address=" + address + ", phone=" + phone + ", email=" + email + ", basicSalary=" + basicSalary + ", liveExpensive=" + liveExpensive + ", password=" + password + '}';
    }

    
    
    public  double getSalary()
     {
          return basicSalary;
     }
}
