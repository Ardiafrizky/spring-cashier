package com.blibli.demo.backend.model.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private String name;
    private String email;

    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getEmail() {
    //     return this.email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }
}
