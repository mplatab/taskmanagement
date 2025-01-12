package com.mplatab.taskmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task_statuses")
public class TaskStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Por ejemplo: PENDING, IN_PROGRESS, COMPLETED, CANCELLED

    private String description;

    @Column(nullable = false)
    private Integer orderIndex; // Para ordenar los estados en la UI
}
