package com.classmate.server.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.realName
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Byte sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.liveAddress
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String liveaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.liveProvence
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String liveprovence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.liveCity
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String livecity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.profession
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String profession;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wechat
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String wechat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastLoginTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Date lastlogintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.loginCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Integer logincount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private byte[] email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
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
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
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
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
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
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
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
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.realName
     *
     * @return the value of user.realName
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.realName
     *
     * @param realname the value for user.realName
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.liveAddress
     *
     * @return the value of user.liveAddress
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getLiveaddress() {
        return liveaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.liveAddress
     *
     * @param liveaddress the value for user.liveAddress
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setLiveaddress(String liveaddress) {
        this.liveaddress = liveaddress == null ? null : liveaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.liveProvence
     *
     * @return the value of user.liveProvence
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getLiveprovence() {
        return liveprovence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.liveProvence
     *
     * @param liveprovence the value for user.liveProvence
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setLiveprovence(String liveprovence) {
        this.liveprovence = liveprovence == null ? null : liveprovence.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.liveCity
     *
     * @return the value of user.liveCity
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getLivecity() {
        return livecity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.liveCity
     *
     * @param livecity the value for user.liveCity
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setLivecity(String livecity) {
        this.livecity = livecity == null ? null : livecity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.profession
     *
     * @return the value of user.profession
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.profession
     *
     * @param profession the value for user.profession
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq
     *
     * @return the value of user.qq
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qq
     *
     * @param qq the value for user.qq
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wechat
     *
     * @return the value of user.wechat
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wechat
     *
     * @param wechat the value for user.wechat
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createTime
     *
     * @return the value of user.createTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.createTime
     *
     * @param createtime the value for user.createTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updateTime
     *
     * @return the value of user.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updateTime
     *
     * @param updatetime the value for user.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastLoginTime
     *
     * @return the value of user.lastLoginTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastLoginTime
     *
     * @param lastlogintime the value for user.lastLoginTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.loginCount
     *
     * @return the value of user.loginCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Integer getLogincount() {
        return logincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.loginCount
     *
     * @param logincount the value for user.loginCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public byte[] getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setEmail(byte[] email) {
        this.email = email;
    }
}