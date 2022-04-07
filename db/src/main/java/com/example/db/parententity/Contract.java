package com.example.db.parententity;

import javax.persistence.MappedSuperclass;
import java.text.SimpleDateFormat;
import java.util.Date;

@MappedSuperclass
public class Contract {

    private String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
}
