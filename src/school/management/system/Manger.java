
package school.management.system;


public class Manger extends Employee{
    
    private double MangerBonus;

    public Manger() {
    }

    public Manger(double MangerBonus) {
        this.MangerBonus = MangerBonus;
    }

    public Manger(double MangerBonus, String Name, String address, String phone, String email, String password) {
        super(Name, address, phone, email, password);
        this.MangerBonus = MangerBonus;
    }

    
    
    
    

   

    

    public void setMangerBonus(double MangerBonus) {
        this.MangerBonus = MangerBonus;
    }

    public double getMangerBonus() {
        return MangerBonus;
    }

    @Override
    public String toString() {
        return "Manger{" + "MangerBonus=" + MangerBonus +  "Name=" + super.getName() + ", id=" + super.getId() + ", address=" + super.getAddress() + ", phone=" + super.getPhone() + ", email=" + super.getEmail() + ", basicSalary=" + super.getBasicSalary() + ", liveExpensive=" + super.liveExpenive() + ", password=" + super.getPassword() + '}';
    }

    

   
    
    
    @Override
    public  double getSalary()
     {
          
          return (super.getSalary()+this.MangerBonus +super.liveExpenive());
     }
    
    
    
}
