package com.springmvc.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.QQ
     *
     * @mbggenerated
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_at
     *
     * @mbggenerated
     */
    private String createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.goods_num
     *
     * @mbggenerated
     */
    private Integer goodsNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.power
     *
     * @mbggenerated
     */
    private Byte power;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_login
     *
     * @mbggenerated
     */
    private String lastLogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated
     */
    private String birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.img_url
     *
     * @mbggenerated
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.residence
     *
     * @mbggenerated
     */
    private String residence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.signature
     *
     * @mbggenerated
     */
    private String signature;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User(Integer id, String phone, String username, String password, String qq, String createAt, Integer goodsNum, Byte power, String lastLogin, Byte status, String birthday, String sex, String imgUrl, String residence, String signature) {
        this.id = id;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.qq = qq;
        this.createAt = createAt;
        this.goodsNum = goodsNum;
        this.power = power;
        this.lastLogin = lastLogin;
        this.status = status;
        this.birthday = birthday;
        this.sex = sex;
        this.imgUrl = imgUrl;
        this.residence = residence;
        this.signature = signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.QQ
     *
     * @return the value of user.QQ
     *
     * @mbggenerated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.QQ
     *
     * @param qq the value for user.QQ
     *
     * @mbggenerated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_at
     *
     * @return the value of user.create_at
     *
     * @mbggenerated
     */
    public String getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_at
     *
     * @param createAt the value for user.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(String createAt) {
        this.createAt = createAt == null ? null : createAt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.goods_num
     *
     * @return the value of user.goods_num
     *
     * @mbggenerated
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.goods_num
     *
     * @param goodsNum the value for user.goods_num
     *
     * @mbggenerated
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.power
     *
     * @return the value of user.power
     *
     * @mbggenerated
     */
    public Byte getPower() {
        return power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.power
     *
     * @param power the value for user.power
     *
     * @mbggenerated
     */
    public void setPower(Byte power) {
        this.power = power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_login
     *
     * @return the value of user.last_login
     *
     * @mbggenerated
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_login
     *
     * @param lastLogin the value for user.last_login
     *
     * @mbggenerated
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin == null ? null : lastLogin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.img_url
     *
     * @return the value of user.img_url
     *
     * @mbggenerated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.img_url
     *
     * @param imgUrl the value for user.img_url
     *
     * @mbggenerated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.residence
     *
     * @return the value of user.residence
     *
     * @mbggenerated
     */
    public String getResidence() {
        return residence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.residence
     *
     * @param residence the value for user.residence
     *
     * @mbggenerated
     */
    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.signature
     *
     * @return the value of user.signature
     *
     * @mbggenerated
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.signature
     *
     * @param signature the value for user.signature
     *
     * @mbggenerated
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }
}