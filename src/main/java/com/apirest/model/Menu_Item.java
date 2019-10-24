/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.model;

/**
 *
 * @author jhon.carrasco
 */
public class Menu_Item {
    private Long item_id;
    private Long cat_menu_id;
    private String item_nombre;
    private String item_desc;
    private Long item_val;

    public Menu_Item() {
    }

    public Menu_Item(Long cat_menu_id, String item_nombre, String item_desc, Long item_val) {
        this.cat_menu_id = cat_menu_id;
        this.item_nombre = item_nombre;
        this.item_desc = item_desc;
        this.item_val = item_val;
    }

    public Menu_Item(Long item_id, Long cat_menu_id, String item_nombre, String item_desc, Long item_val) {
        this.item_id = item_id;
        this.cat_menu_id = cat_menu_id;
        this.item_nombre = item_nombre;
        this.item_desc = item_desc;
        this.item_val = item_val;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Long getCat_menu_id() {
        return cat_menu_id;
    }

    public void setCat_menu_id(Long cat_menu_id) {
        this.cat_menu_id = cat_menu_id;
    }

    public String getItem_nombre() {
        return item_nombre;
    }

    public void setItem_nombre(String item_nombre) {
        this.item_nombre = item_nombre;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

    public Long getItem_val() {
        return item_val;
    }

    public void setItem_val(Long item_val) {
        this.item_val = item_val;
    }
    
}
