package model;

public class Customer {
    private String customerCode; // 거래처 코드
    private String customerName; // 거래처 명
    private String ceoName;      // 대표자 명
    private String businessType; // 업태
    private String industry;     // 종목
    private String phone;        // 전화번호
    private String fax;          // 팩스번호
    private String searchContent;// 검색내용
    private String mobile;       // 휴대전화
    private String postalCode;   // 우편번호
    private String address1;     // 주소
    private String website;      // 홈페이지
    private String responsibleEmployee; // 담당자
    private String email;        // 이메일

    // 생성자
    public Customer(String customerCode, String customerName, String ceoName, String businessType, 
                    String industry, String phone, String fax, String searchContent, 
                    String mobile, String postalCode, String address1, String website, 
                    String responsibleEmployee, String email) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.ceoName = ceoName;
        this.businessType = businessType;
        this.industry = industry;
        this.phone = phone;
        this.fax = fax;
        this.searchContent = searchContent;
        this.mobile = mobile;
        this.postalCode = postalCode;
        this.address1 = address1;
        this.website = website;
        this.responsibleEmployee = responsibleEmployee;
        this.email = email;
    }

    // Getter와 Setter 메서드
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(String responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
