package com.test.api.service;


import com.test.api.mapper.UserMapper;
import com.test.api.model.Admin;
import com.test.api.model.User;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.core.io.ResourceLoader;

@Service
public class UserService {


    @Resource
    ResourceLoader resourceLoader;

    @Autowired
    UserMapper userMapper;

    public List<User> get(String pid) throws IOException {
        List<User> users=userMapper.getAll(pid);

        HSSFWorkbook wb = new HSSFWorkbook();
        //  创建一个工作表
        HSSFSheet sheet = wb.createSheet();
        //  创建行
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("ReceiveDate");
        row.createCell(1).setCellValue("CName");
        row.createCell(2).setCellValue("PatNo");
        row.createCell(3).setCellValue("ID_Number_patient");
        row.createCell(4).setCellValue("zdy4");
        row.createCell(5).setCellValue("DeptName");
        row.createCell(6).setCellValue("ZDY7");
        for (int i = 1; i < users.size(); i++) {
            HSSFRow rows = sheet.createRow(i);
            User user=users.get(i-1);
            for(int j=0;j<6;j++){
                rows.createCell(0).setCellValue(user.getReceiveData());
                rows.createCell(1).setCellValue(user.getcName());
                rows.createCell(2).setCellValue(user.getPatNo());
                rows.createCell(3).setCellValue(user.getIdNumberPatient());
                rows.createCell(4).setCellValue(user.getZdy4());
                rows.createCell(5).setCellValue(user.getDeptName());
                rows.createCell(6).setCellValue(user.getZdy7());
            }


        }
        FileOutputStream fos = new FileOutputStream("D:/export.xls");
        wb.write(fos);
        fos.close();

        return userMapper.getAll(pid);
    }

}
