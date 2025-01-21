package com.hlxllo.mediator;

/**
 * @author hlxllo
 * @description 具体中介者类
 * @date 2025/1/21
 */
public class MediatorImpl extends Mediator {
    private Person tenant;

    private Person houseOwner;

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public Person getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(Person houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void contact(String msg, Person person) {
        if (person == tenant) {
            houseOwner.getMessage(msg);
        } else {
            tenant.getMessage(msg);
        }
    }
}
