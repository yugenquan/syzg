package cn.com.syzg.model;

public class Cart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goodsId
     *
     * @mbg.generated
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goodsNum
     *
     * @mbg.generated
     */
    private Integer goodsnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.id
     *
     * @return the value of cart.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.id
     *
     * @param id the value for cart.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goodsId
     *
     * @return the value of cart.goodsId
     *
     * @mbg.generated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goodsId
     *
     * @param goodsid the value for cart.goodsId
     *
     * @mbg.generated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goodsNum
     *
     * @return the value of cart.goodsNum
     *
     * @mbg.generated
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goodsNum
     *
     * @param goodsnum the value for cart.goodsNum
     *
     * @mbg.generated
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }
}