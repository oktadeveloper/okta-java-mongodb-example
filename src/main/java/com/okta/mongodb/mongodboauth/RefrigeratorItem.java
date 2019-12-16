package com.okta.mongodb.mongodboauth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorItem {

    @Id
    private String id;
    private String name;
    private String owner;
    private Date expiration;
}
