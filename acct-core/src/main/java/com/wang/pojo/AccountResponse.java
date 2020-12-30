package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse implements Serializable {

    private String returnCode;

    private String returnMessage;
}
