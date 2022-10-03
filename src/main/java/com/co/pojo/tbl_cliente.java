package com.co.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_cliente")
public class tbl_cliente implements Serializable {

    @Id
    private Integer clien_id;
    private String clien_user;
    private String clien_password;
}
