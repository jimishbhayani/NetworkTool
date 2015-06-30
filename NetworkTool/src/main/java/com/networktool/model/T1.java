/**
 * 
 */
package com.networktool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jbhayani
 *
 */
@Entity
@Table(name = "T1")
public class T1 {

    @Id
    @Column(name = "C1")
    private int c1;
    @Column(name = "C2")
    private int c2;

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "T1 [c1=" + c1 + ", c2=" + c2 + "]";
    }

}
