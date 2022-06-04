
package school.management.system;


public class Teacher extends Employee{
    
    private int classcoun;
    
    
   /**
    * . Constructors    
    */
    public Teacher() {
    }

    public Teacher(int classcoun, String Name, String address, String phone, String email, String password) {
        super(Name, address, phone, email, password);
        this.classcoun = classcoun;
    }

    
    
    

    public void setClasscoun(int classcoun) {
        this.classcoun = classcoun;
    }

    public int getClasscoun() {
        return classcoun;
    }

    @Override
    public String toString() {
        return "Teacher{" + "classcoun=" + classcoun +  "Name=" + super.getName() + ", id=" + super.getId() + ", address=" + super.getAddress() + ", phone=" + super.getPhone() + ", email=" + super.getEmail() + ", basicSalary=" + super.getBasicSalary() + ", liveExpensive=" + super.liveExpenive() + ", password=" + super.getPassword() + '}';
    }

    
    
    
    @Override
    public  double getSalary()
     {
         
          return super.getBasicSalary() + super.liveExpenive() + (this.classcoun*20)  ;
     }
    
    
}
