public class Passenger  {
    //Getters & Setters
    String name;
    String email;
    String gender;
    //{"M", "F"};
    int age;
    int phoneNum = 0;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(String email){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Integer getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public Integer getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }
}
