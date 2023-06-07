package com.example;

import lombok.Getter;
import lombok.Setter;
import mm.com.mytel.utils.v1.report.ExcelUtil;


/**
 * @author PM
 * @Created 07/06/2023
 * <p>
 * created by sayr G
 */
@Setter
@Getter
public class TestApiClass {
    private String name;

    private void test() {
        ExcelUtil.saveToFile("abce", null, null, null);
    }
}
