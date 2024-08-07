package model;

public class Employee {
    private String employeeCode; // 담당자 코드
    private String employeeName; // 담당자 명
    private String searchContent;// 검색 내용
    private String menuCodeUsage;// 메뉴 코드 사용
    private String memo;         // 메모
    private String contactNumber;// 연락처
    private String email;        // 이메일

    // 생성자
    public Employee(String employeeCode, String employeeName, String searchContent, 
                    String menuCodeUsage, String memo, String contactNumber, 
                    String email) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.searchContent = searchContent;
        this.menuCodeUsage = menuCodeUsage;
        this.memo = memo;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Getter와 Setter 메서드
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getMenuCodeUsage() {
        return menuCodeUsage;
    }

    public void setMenuCodeUsage(String menuCodeUsage) {
        this.menuCodeUsage = menuCodeUsage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
