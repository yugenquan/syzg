package cn.com.syzg.model;

public class Emply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emply.emplyNo
     *
     * @mbg.generated
     */
    private String emplyno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emply.emplyName
     *
     * @mbg.generated
     */
    private String emplyname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emply.emplyNo
     *
     * @return the value of emply.emplyNo
     *
     * @mbg.generated
     */
    public String getEmplyno() {
        return emplyno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emply.emplyNo
     *
     * @param emplyno the value for emply.emplyNo
     *
     * @mbg.generated
     */
    public void setEmplyno(String emplyno) {
        this.emplyno = emplyno == null ? null : emplyno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emply.emplyName
     *
     * @return the value of emply.emplyName
     *
     * @mbg.generated
     */
    public String getEmplyname() {
        return emplyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emply.emplyName
     *
     * @param emplyname the value for emply.emplyName
     *
     * @mbg.generated
     */
    public void setEmplyname(String emplyname) {
        this.emplyname = emplyname == null ? null : emplyname.trim();
    }
}