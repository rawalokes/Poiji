package com.lokes.poijitry.entity;

import com.poiji.annotation.ExcelCell;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "emp_details")
public class Employee {
    @Id
    @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
    @GeneratedValue(generator = "employee_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name", length = 100)
    @ExcelCell(1)
    private String name;
    @ExcelCell(2)
    @Column(name = "email", length = 100)
    private String email;
    @ExcelCell(3)
    @Column(name = "mobile_no", length = 14)
    private String mobile;

    @ExcelCell(4)
    @Column(name = "department", length = 50)
    private String department;

    @ExcelCell(5)
    @Column(name = "employee_id", length = 10)
    private Integer employeeID;


}
