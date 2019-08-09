package com.example.ProjectAllianz.dto;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Data
public class CustomerDto {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String preferredLanguages;


}
