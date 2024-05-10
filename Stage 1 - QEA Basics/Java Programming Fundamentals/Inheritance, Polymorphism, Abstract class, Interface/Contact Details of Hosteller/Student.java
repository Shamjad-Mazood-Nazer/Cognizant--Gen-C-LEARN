public class Student{
    protected int studentId, departmentId;
    protected String name, gender, phone;
    
    public int getStudentId(){
        return studentId;
    }
    
    public void setStudentId(int sid){
        studentId = sid;
    }    
    
    public int getDepartmentId(){
        return studentId;
    }
    
    public void setDepartmentId(int did){
        departmentId = did;
    }    
    
    public String getName(){
        return name;
    }
    
    public void setName(String sname){
        name = sname;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String sgender){
        gender = sgender;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String sPhone){
        phone = sPhone;
    }
}