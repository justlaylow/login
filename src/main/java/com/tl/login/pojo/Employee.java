package com.tl.login.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {

    private Integer empId;

    private String empName;

    private String empJobTitle;

    private String empWorkCategory;

    private String empIdNumber;

    private Integer empPhone;

    private String empSex;

    private Integer empAge;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date empEntryDate;

    private String empDepartment;

    private String empNativePlace;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpJobTitle() {
        return empJobTitle;
    }

    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle == null ? null : empJobTitle.trim();
    }

    public String getEmpWorkCategory() {
        return empWorkCategory;
    }

    public void setEmpWorkCategory(String empWorkCategory) {
        this.empWorkCategory = empWorkCategory == null ? null : empWorkCategory.trim();
    }

    public String getEmpIdNumber() {
        return empIdNumber;
    }

    public void setEmpIdNumber(String empIdNumber) {
        this.empIdNumber = empIdNumber == null ? null : empIdNumber.trim();
    }

    public Integer getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(Integer empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Date getEmpEntryDate() {
        return empEntryDate;
    }

    public void setEmpEntryDate(Date empEntryDate) {
        this.empEntryDate = empEntryDate;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment == null ? null : empDepartment.trim();
    }

    public String getEmpNativePlace() {
        return empNativePlace;
    }

    public void setEmpNativePlace(String empNativePlace) {
        this.empNativePlace = empNativePlace == null ? null : empNativePlace.trim();
    }
}