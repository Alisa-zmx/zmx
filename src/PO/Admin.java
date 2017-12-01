/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PO;

/**
 *
 * @author mengxue Zhang
 */
public class Admin implements java.io.Serializable{
    private String adminid;
    private Integer shenfen;
    private String adminpassword;
    private String realname;
    private String sex;
    private String birth;
    private String phone;
    private String email;
    private String adminnote;
    private Integer flag;
   
    public Admin(){}
    
    public String getAdminid(){
        return adminid;
    }
    
    public void setAdminid(String adminid){
        this.adminid=adminid;
    }
    
    public Integer getShenfen(){
        return shenfen;
    }
    
    public void setShenfen(Integer shenfen){
        this.shenfen=shenfen;
    }
    
    public String getAdminpassword(){
        return adminpassword;
    }
    
    public void setAdminpassword(String adminpassword){
        this.adminpassword=adminpassword;
    }
    
    public String getRealname(){
        return realname;
    }
    
    public void setRealname(String realname){
        this.realname=realname;
    }
    
    public String getSex(){
        return sex;
    }
    
    public void setSex(String sex){
        this.sex=sex;
    }
    
    public String getBirth(){
        return birth;
    }
    
    public void setBirth(String birth){
        this.birth=birth;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getAdminnote(){
        return adminnote;
    }
    
    public void setAdminnote(String adminnote){
        this.adminnote=adminnote;
    }
    
    public Integer getFlag(){
        return flag;
    }
    
    public void setFlag(Integer flag){
        this.flag=flag;
    }
}
