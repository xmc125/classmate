package com.classmate.server.model;

import java.util.Date;

public class Album {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.id
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.userId
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.title
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.discription
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private String discription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.cteateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Date cteatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column album.clickCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    private Integer clickcount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.id
     *
     * @return the value of album.id
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.id
     *
     * @param id the value for album.id
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.userId
     *
     * @return the value of album.userId
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.userId
     *
     * @param userid the value for album.userId
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.title
     *
     * @return the value of album.title
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.title
     *
     * @param title the value for album.title
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.discription
     *
     * @return the value of album.discription
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.discription
     *
     * @param discription the value for album.discription
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.cteateTime
     *
     * @return the value of album.cteateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Date getCteatetime() {
        return cteatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.cteateTime
     *
     * @param cteatetime the value for album.cteateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setCteatetime(Date cteatetime) {
        this.cteatetime = cteatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.updateTime
     *
     * @return the value of album.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.updateTime
     *
     * @param updatetime the value for album.updateTime
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column album.clickCount
     *
     * @return the value of album.clickCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public Integer getClickcount() {
        return clickcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column album.clickCount
     *
     * @param clickcount the value for album.clickCount
     *
     * @mbggenerated Tue Jul 18 14:59:12 CST 2017
     */
    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }
}