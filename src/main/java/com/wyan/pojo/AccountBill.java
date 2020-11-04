package com.wyan.pojo;

/**
 * @Auther: wyan
 * @Date: 2020-06-10 19:37
 * @Description: 对账单
 */
public class AccountBill {

    private String id;
    private String order_num;
    private String num_id;
    private Integer price;
    private Integer sale_price;
    private Integer sale_agent;
    private String agent_name;
    private String  order_time;
    private Integer profit;
    private Integer profit_ratio;
    private Integer user_id;
    private Integer saleType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getNum_id() {
        return num_id;
    }

    public void setNum_id(String num_id) {
        this.num_id = num_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSale_price() {
        return sale_price;
    }

    public void setSale_price(Integer sale_price) {
        this.sale_price = sale_price;
    }

    public Integer getSale_agent() {
        return sale_agent;
    }

    public void setSale_agent(Integer sale_agent) {
        this.sale_agent = sale_agent;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getProfit_ratio() {
        return profit_ratio;
    }

    public void setProfit_ratio(Integer profit_ratio) {
        this.profit_ratio = profit_ratio;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }
}
