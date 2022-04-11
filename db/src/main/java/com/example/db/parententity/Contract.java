package com.example.db.parententity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.text.SimpleDateFormat;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    private String creationDate = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
}
