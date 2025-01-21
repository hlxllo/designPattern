package com.hlxllo.mediator;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Person tenant = new Tenant("张三", mediator);
        Person houseOwner = new HouseOwner("李四", mediator);
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        tenant.contact("我要租三室的房子");
        houseOwner.contact("我这里有三室的房子，你要吗");
    }
}
