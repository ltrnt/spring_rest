package ru.ltrnt.spring.rest.exception_handling;

public class EmployeeIncorrectData {
    private String errorInfo;

    public EmployeeIncorrectData() {
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}
